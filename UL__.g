lexer grammar UL;

T22 : '(' ;
T23 : ')' ;
T24 : ',' ;
T25 : '[' ;
T26 : ']' ;
T27 : '{' ;
T28 : '}' ;
T29 : ';' ;
T30 : 'print' ;
T31 : 'println' ;
T32 : '=' ;
T33 : 'return' ;
T34 : '*' ;
T35 : '+' ;
T36 : '-' ;
T37 : '<' ;
T38 : '==' ;

// $ANTLR src "UL.g" 123
IF	: 'if'
    ;

// $ANTLR src "UL.g" 126
WHILE : 'while'
      ;

// $ANTLR src "UL.g" 129
ELSE : 'else'
     ;

// $ANTLR src "UL.g" 132
TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;

// $ANTLR src "UL.g" 140
TRUE:  'true'   ;
// $ANTLR src "UL.g" 141
FALSE: 'false'  ;

// $ANTLR src "UL.g" 143
INTEGERCONST : ('0'..'9')+
             ;

// $ANTLR src "UL.g" 146
FLOATCONST : ('0'..'9')+'.'('0'..'9')+
           ;

// $ANTLR src "UL.g" 149
CHARCONST    : '\''('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')'\''
             ;

// $ANTLR src "UL.g" 152
STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;

// $ANTLR src "UL.g" 155
ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;

// $ANTLR src "UL.g" 158
WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

// $ANTLR src "UL.g" 161
COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n')? { $channel = HIDDEN;}
        ;
