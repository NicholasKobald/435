# Repo for 435 assignments

#### Language examples 
FizzBuzz in .ul: 

```
void main() {
    int n;
    int temp_five;
    int temp_three;

    n = 1;

    while (n < 101) {
        temp_five = n;
        temp_three = n;
        while (0 < temp_three) { temp_three = temp_three - 3; }
        while (0 < temp_five) { temp_five = temp_five - 5; }

        if (temp_three == 0) {
            if (temp_five == 0) {
                print "FizzBuzz";
            } else {
                print "Fizz";
            }
        } else {
            if (temp_five == 0) {
                print "Buzz";
            } else {
                print n;
            }
        }
        print " ";
        n = n + 1;
    }
}
```
#### Assignment 2 notes/bonus:
    - I allow multiplying of int/float, which evaluates to float
    - I allow math expressions on characters, which evaluate to character
    - an attempt is made to prevent people from using variables before they have a value
    - function return types are checked



Lets make a compiler!

#### Build the class files

This version should be Java7 friendly, so we can build with the following two commands: 

```
source uviccp # point to class files in jasons directory 
make
```

#### Run on some file

Skip ahead to the next section if you have Python3.6 or higher. 

`java Compiler path/to/UL/file`

A number of tests are in `/tests`/, for example

`java Compiler tests/accept_complicated_expressions.ul` 


## Running the Tests Automaticly 

The test running script requires Python3.6. The lab machines run version 3.4.

### Run the tests  (this will also build the project from scratch each time)

`python3 runtests.py`

###  Test commands:

#### Checking the AST/PPrinter 

```
    mkdir tests/pprint_output 
    python3 runtests.py --write-pprint # populate tests/pprint_output/ with corresponding PPrint outputs 
``` 
Then, we can always check against the existing pprint output by running tests with 
```
    python3 runtests.py --check-ast 
``` 

#### Other test commands 
Run compiler on a specific file 

`python3 runtests.py -n <name_of_file> # run a specific test, you don't need to indiciate the directory`

The test runner creates a `.tests_cache` of the previously failed tests. To re-run only the tests that failed on the last run, use

`python3 runtests.py --failed # run the tests that failed last time`


Copy Pastas:

>ANTLR lexers fully assign unambiguous token types before the parser is ever used. When multiple token types can match a token, the first one appearing in the grammar is the one that is used. For your grammar, a token cannot have the type ID and the type LRULEID at the same time. Since the input foo matches both of these lexer rules, the first appearing in the grammar is used so your tokens are: ID, COLON, ID, SEMICOLON, <EOF>.

>Since the ID token is never actually referenced in the parser, I suggest one of the following changes. Either of these options will resolve the problem you have described, so the choice is entirely your preference for how the final grammar looks.
https://stackoverflow.com/questions/16856963/antlr-no-viable-alternative-error

Quote of the day:
>Action placement is fairly straightforward if you view grammars as programs in a very high-level domain-specific language.

-Antlr book
