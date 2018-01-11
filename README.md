# Repo for 435 assignments

Lets make a compiler!

### Run the tests  (this will also build the project from scratch each time)

`python3 runtests.py`

#### Build the class files

`make`

#### Run Compiler on some file

`java Compiler /path/to/ULfile`

#### Test commands:

`python3 runtests.py -n <name_of_file> # run a specific test, you don't need to indiciate the directory`

`python3 runtests.py --failed # run the tests that failed last time`


Copy Pastas:

>ANTLR lexers fully assign unambiguous token types before the parser is ever used. When multiple token types can match a token, the first one appearing in the grammar is the one that is used. For your grammar, a token cannot have the type ID and the type LRULEID at the same time. Since the input foo matches both of these lexer rules, the first appearing in the grammar is used so your tokens are: ID, COLON, ID, SEMICOLON, <EOF>.

>Since the ID token is never actually referenced in the parser, I suggest one of the following changes. Either of these options will resolve the problem you have described, so the choice is entirely your preference for how the final grammar looks.
https://stackoverflow.com/questions/16856963/antlr-no-viable-alternative-error

Quote of the day:
>Action placement is fairly straightforward if you view grammars as programs in a very high-level domain-specific language.

-Antlr book
