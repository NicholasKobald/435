grammar UL;
options {
    backtrack=true;
    output=AST;
}
//Probably need some more
tokens {
    VARDEC;
    FUNCDEC;
    EXPR;
    FUNCCALL;
    FUNCBODY;
    ARRINDEX;
}

@members
{
protected void mismatch (IntStream input, int ttype, BitSet follow)
        throws RecognitionException
{
        throw new MismatchedTokenException(ttype, input);
}
public void recoverFromMismatchedSet (IntStream input,
                                      RecognitionException e,
                                      BitSet follow)
        throws RecognitionException
{
        reportError(e);
        throw e;
}
}

@rulecatch {
        catch (RecognitionException ex) {
                reportError(ex);
                throw ex;
        }
}

/* Lexer */
program : function+ ;

function : functionDecl functionBody ;

functionDecl : type identifier '(' formalParameters ')' -> ^(FUNCDEC type identifier formalParameters );

formalParameters : compoundType identifier formals*
                 |
                 ;

formals : ',' compoundType identifier ;

compoundType : TYPE
             | TYPE '[' INTEGERCONST ']'
             ;

functionBody : '{' varDec* statement* '}' -> ^(FUNCBODY varDec* statement* )
             ;

varDec : compoundType ID ';' -> ^(VARDEC compoundType ID) ;

//still needs some more AST annotations
statement : ';'!
          | expr ';'!
          | 'print' expr ';'!
          | 'println' expr ';'!
          | ID '=' expr ';'                     -> ^('=' ID expr)
          | ID '[' expr ']' '=' expr ';'        -> ^('=' ID '[' expr ']' expr)
          | 'return' ';'
          | 'return' expr ';'
          | WHILE '(' expr ')' block            -> ^(WHILE expr block)
          | IF '(' expr ')' block ELSE block    -> ^(IF expr block ELSE block)
          | IF '(' expr ')' block               -> ^(IF expr block)
          ;


block : '{'! statement* '}'!
      ;

exprList : expr exprMore*
         |
         ;

baseExp :
        | ID
        | literal
        | '('! expr ')'!
        | ID '(' exprList ')' -> ^(FUNCCALL ID exprList)
        ;

exprMore : ',' expr
         ;

multExp : baseExp ('*'^ baseExp)*
        ;

addExp : multExp (('+'^|'-'^) multExp)*
       ;


equalityLT : addExp ('<'^ addExp)*
           ;

equalityExp : equalityLT ( '=='^ equalityLT)?
            ;

expr : equalityExp
     | ID '(' exprList ')'
     | ID '[' expr ']' -> ^(ARRINDEX ID expr)
     ;

identifier : ID ;

type  : TYPE ;

literal: STRINGCONST
       | INTEGERCONST
       | FLOATCONST
       | CHARCONST
       | TRUE
       | FALSE
       ;

IF	: 'if'
    ;

WHILE : 'while'
      ;

ELSE : 'else'
     ;

TYPE    : 'int'
        | 'string'
        | 'float'
        | 'char'
        | 'void'
        | 'boolean'
        ;

TRUE:  'true'   ;
FALSE: 'false'  ;

INTEGERCONST : ('0'..'9')+
             ;

FLOATCONST : ('0'..'9')+'.'('0'..'9')+
           ;

CHARCONST    : '\''('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')'\''
             ;

STRINGCONST  : '"'('a'..'z'|'A'..'Z'|'_'|' '|'0'..'9'|'.'|','|'!')*'"'
             ;

ID	: ('a'..'z'|'A'..'Z'|'_')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
    ;

WS      : ( '\t' | ' ' | ('\r' | '\n') )+ { $channel = HIDDEN;}
        ;

COMMENT : '//' ~('\r' | '\n')* ('\r' | '\n')? { $channel = HIDDEN;}
        ;
