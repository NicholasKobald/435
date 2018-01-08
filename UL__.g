lexer grammar UL;

T19 : '(' ;
T20 : ')' ;
T21 : ',' ;
T22 : '[' ;
T23 : ']' ;
T24 : '{' ;
T25 : '}' ;
T26 : ';' ;
T27 : 'print' ;
T28 : 'println' ;
T29 : '=' ;
T30 : 'return' ;
T31 : '*' ;
T32 : '+' ;
T33 : '-' ;
T34 : '<' ;
T35 : '==' ;

// $ANTLR src "UL.g" 120
IF	: 'if'
    ;

// $ANTLR src "UL.g" 123
WHILE : 'while'
      ;

// $ANTLR src "UL.g" 126
ELSE : 'else'
     ;

// $ANTLR src "UL.g" 129
TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;

// $ANTLR src "UL.g" 137
TRUE:  'true'   ;
// $ANTLR src "UL.g" 138
FALSE: 'false'  ;

// $ANTLR src "UL.g" 140
INTEGERCONST : ('0'..'9')+
             ;

// $ANTLR src "UL.g" 143
FLOATCONST : ('0'..'9')+'.'('0'..'9')+
           ;

// $ANTLR src "UL.g" 146
CHARCONST    : '\''('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')'\''
             ;

// $ANTLR src "UL.g" 149
STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;

// $ANTLR src "UL.g" 152
ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;

// $ANTLR src "UL.g" 155
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

// $ANTLR src "UL.g" 158
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n')? { $channel = HIDDEN;}
        ;
