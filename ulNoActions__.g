lexer grammar ulNoActions;

T17 : '(' ;
T18 : ')' ;
T19 : ',' ;
T20 : '[' ;
T21 : ']' ;
T22 : '{' ;
T23 : '}' ;
T24 : ';' ;
T25 : 'print' ;
T26 : 'println' ;
T27 : '=' ;
T28 : 'return' ;
T29 : '*' ;
T30 : '+' ;
T31 : '-' ;
T32 : '<' ;
T33 : '==' ;

// $ANTLR src "ulNoActions.g" 155
IF	: 'if'
    ;


// $ANTLR src "ulNoActions.g" 159
WHILE : 'while'
      ;


// $ANTLR src "ulNoActions.g" 163
ELSE : 'else'
     ;


// $ANTLR src "ulNoActions.g" 167
TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;


// $ANTLR src "ulNoActions.g" 176
TRUE:  'true'   ;
// $ANTLR src "ulNoActions.g" 177
FALSE: 'false'  ;


// $ANTLR src "ulNoActions.g" 180
INTEGERCONST : ('0'..'9')+
             ;

// $ANTLR src "ulNoActions.g" 183
FLOATCONST : ('0'..'9')+'.'('0'..'9')+
           ;

// $ANTLR src "ulNoActions.g" 186
CHARCONST    : '\''('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')'\''
             ;


// $ANTLR src "ulNoActions.g" 190
STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;


// $ANTLR src "ulNoActions.g" 194
ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;



// $ANTLR src "ulNoActions.g" 199
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;


// $ANTLR src "ulNoActions.g" 203
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n')? { $channel = HIDDEN;}
        ;
