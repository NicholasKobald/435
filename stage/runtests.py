import time
import sys
import argparse
import glob
from subprocess import Popen, PIPE, run

success_count, fail_count = 0, 0

parser = argparse.ArgumentParser(description='This is the compiler test running script!')
parser.add_argument('--ignore-warnings', default=False, dest='ignore_Warnings')
parser.add_argument('specific_test', action="store")

class FailedToCompileError(Exception):
    pass

def collect_files():
    accepts, rejects = [], []
    for f in glob.glob('tests/*.ul'):
        if 'accept' in f:
            accepts.append(f)
        else:
            rejects.append(f)

    return accepts, rejects


def run_tests(test_list):
    for test in test_list:
        run_on_test_file(test)

def run_on_test_file(test):
    make = run(['java', 'Compiler', test],
                stdin=PIPE, stderr=PIPE)
    print("err:", make.stderr)
    print("out:", make.stdout)




def main():
    make = run(['make'], stdout=PIPE, stderr=PIPE)
    err = make.stderr.lower()
    if b'err' in err:
        raise FailedToCompileError(
            "Antlr wasn't able to compile your grammar\n {}".format(err))
    if b'warn' in err:
        raise FailedToCompileError(
            "Antlr Compiled with warnings. Rerun with -f to override this\n".format(err))

    print("Javac Compiled with no Errors or warnings.\n")
    accept, reject = collect_files()
    run_tests(accept)


if __name__ == "__main__":
    try:
        main()
    except FailedToCompileError as e:
        print("FailedToCompileErr: {}".format(str(e)))
