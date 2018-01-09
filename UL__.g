lexer grammar UL;

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

// $ANTLR src "UL.g" 115
IF	: 'if'
    ;

// $ANTLR src "UL.g" 118
WHILE : 'while'
      ;

// $ANTLR src "UL.g" 121
ELSE : 'else'
     ;

// $ANTLR src "UL.g" 124
TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;

// $ANTLR src "UL.g" 132
TRUE:  'true'   ;
// $ANTLR src "UL.g" 133
FALSE: 'false'  ;

// $ANTLR src "UL.g" 135
INTEGERCONST : ('0'..'9')+
             ;

// $ANTLR src "UL.g" 138
FLOATCONST : ('0'..'9')+'.'('0'..'9')+
           ;

// $ANTLR src "UL.g" 141
CHARCONST    : '\''('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')'\''
             ;

// $ANTLR src "UL.g" 144
STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;

// $ANTLR src "UL.g" 147
ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;

// $ANTLR src "UL.g" 150
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

// $ANTLR src "UL.g" 153
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n')? { $channel = HIDDEN;}
        ;
