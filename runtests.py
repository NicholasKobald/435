#
# THIS SOFTWARE IS DISTRBUTED AS IS

import time
import json
import sys
import argparse
import glob
from subprocess import Popen, PIPE, run

success_count, fail_count = 0, 0

parser = argparse.ArgumentParser(description='This is the compiler test running script!')
parser.add_argument('--ignore-warnings', default=False, dest='ignore_Warnings')
parser.add_argument('-n', '--test-name', default='all', action="store")
parser.add_argument('--silent', default=False, dest='none-verbose')
parser.add_argument('--clean', default=False, dest='clean-first')
parser.add_argument('-f', '--failed',
                    help="Run failed tests from previous invocation",
                    action="store_true")


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
    failed_tests = []
    for test in test_list:
        failed = run_on_test_file(test, 'reject' in test)
        if failed is not None:
            failed_tests.append(failed)
    if failed_tests:
        with open('.tests-cache', 'w') as f:
            f.write(json.dumps({'failed_tests': failed_tests}))
        print("=" * 70)
        print("Wrote failed tests to Cache. Rerun with --failed")


def run_on_test_file(test, reject):
    global success_count, fail_count
    make = run(['java', 'Compiler', test],
                stdin=PIPE, stderr=PIPE)
    err = make.stderr
    if err and not reject:
        print("FAILED: {} - FAILURE TO ACCEPT. Output:".format(test))
        print(err.decode('utf-8'))
        fail_count += 1
        return test
    elif reject and not err:
        print("FAILED: {} - FAILURE TO REJECT".format(test))
    else:
        print("Correctly {} {}".format('rejected' if reject else 'accepted', test.split('/')[-1]))
        success_count += 1


def compile_proj():
    global success_count, fail_count
    make = run(['make'], stdout=PIPE, stderr=PIPE)
    err = make.stderr.lower()
    if b'err' in err:
        raise FailedToCompileError(
            "Antlr wasn't able to compile your grammar\n {}".format(err))
    if b'warn' in err:
        raise FailedToCompileError(
            "Antlr Compiled with warnings. Rerun with -f to override this\n".format(err))


def collect_failed_files(a, r):
    tests = []
    try:
        with open('.tests-cache', 'r') as f:
            tests = json.loads(f.read())
    except FileNotFoundError:
        print("=" * 70)
        print("No Test Cache found. Run without --failed first")
    tests = tests['failed_tests']
    return [t for t in tests if t in a], [t for t in tests if t in r]


def main(args):
    global success_count, fail_count
    start = time.time()
    try:
        compile_proj()
    except FailedToCompileError as e:
        print("FailedToCompileErr: {}".format(e))
        return
    if args.test_name != 'all': # run a specific test
        run_on_test_file(
            'tests/{}{}'.format(args.test_name, '.ul' if '.ul' not in args.test_name else ''),
            reject='reject' in args.test_name)
        return

    print("Javac Compiled with no Errors or warnings.\n")
    accept, reject = collect_files()
    if args.failed:
        accept, reject = collect_failed_files(accept, reject)

    # start_two = time.time()
    accept.extend(reject)
    run_tests(accept)
    end = time.time()
    num_tests = str(len(accept))
    print("=" * 70)
    print("All Tests completed. Ran {} tests with {} failures in {} seconds.".format(num_tests, str(fail_count), end - start))


if __name__ == "__main__":
    args = parser.parse_args()
    main(args)
