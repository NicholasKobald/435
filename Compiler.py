#
# Experimental Python3 implementation of the Compiler 435 project

import sys
import argparse

from antlr3 import *
from antlr3.tree import CommonTree

# fix Antlrs Issues
reload(sys)
sys.setdefaultencoding('utf8')

parser = argparse.ArgumentParser(description='lil compiler boi')
parser.add_argument('file', help="File to run compiler on")


def run_antlr_lexer(filename):
    f = open(filename)
    input_stream = ANTLRInputStream(f)
    lexer = ExprLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = ExprParser(tokens)
    r = parser.stat()


def main(filename):
    run_antlr_lexer(filename)


if __name__ == "__main__":
    args = parser.parse_args()
    main(args.file)
