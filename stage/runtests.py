import glob
import subprocess
import time
import sys

success_count, fail_count = 0, 0

accepts, rejects = [], []
for f in glob.glob('tests/*.ul'):
    if 'accept' in f:
        accepts.append(f)
    else:
        rejects.append(f)

total_tests = len(accepts) + len(rejects)

subprocess.call('make')

# few TODOs here when we actually have things to test
for accept_test in accepts:
    print('java Compiler {}'.format(accept_test))
    subprocess.Popen(['java', 'Compiler', accept_test])

for reject_test in rejects:
    print('java Compiler {}'.format(accept_test))
    subprocess.Popen(['java', 'Compiler', reject_test])





