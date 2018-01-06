#
# THIS SOFTWARE IS DISTRBUTED AS IS

import time
import sys
import argparse
import glob
from subprocess import Popen, PIPE, run

success_count, fail_count = 0, 0

# TODO use these
parser = argparse.ArgumentParser(description='This is the compiler test running script!')
parser.add_argument('--ignore-warnings', default=False, dest='ignore_Warnings')
parser.add_argument('specific_test', action="store")
parser.add_argument('--silent', default=False, dest='none-verbose')
parser.add_argument('--clean', default=False, dest='clean-first')


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


def run_tests(test_list, reject=False):
    for test in test_list:
        run_on_test_file(test, reject)


def run_on_test_file(test, reject):
    global success_count, fail_count
    make = run(['java', 'Compiler', test],
                stdin=PIPE, stderr=PIPE)
    err = make.stderr
    if err and not reject:
        print("FAILED: {} - FAILURE TO ACCEPT. Output:".format(test))
        print(err)
        print()
        fail_count += 1
    else:
        print("Correctly {} {}".format('rejected' if reject else 'accepted', test.split('/')[-1]))
        success_count += 1

# TODO
# use git to figure out what tests are new or have been changed
# only run on those
# fucking genius, nick
# oh and cache failed ones!
# this isn't reinventing the wheel.
def main():
    global success_count, fail_count
    start = time.time()
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
    # start_two = time.time()
    run_tests(accept)
    run_tests(reject, reject=True)
    end = time.time()
    num_tests = str(len(accept) + len(reject))
    print("=" * 60)
    print("All Tests completed. Ran {} tests with {} failures in {} seconds.".format(num_tests, str(fail_count), end - start))

if __name__ == "__main__":
    try:
        main()
    except FailedToCompileError as e:
        print("FailedToCompileErr: {}".format(str(e)))
