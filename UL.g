grammar UL;
options {
    backtrack=true;
}
@header {
    import ast.*;
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
program returns [Program prog]
        @init{
            prog = new Program();
        }
        : (f = function {prog.append(f);})+ EOF
        ;

function returns [Function f]
        @init{
            f = new Function();
        }
        : (dec = functionDecl body = functionBody) {f.fillFunction(dec, body);}
        ;

functionDecl returns [FunctionDeclaration funcdec]
            @init{
                funcdec = new FunctionDeclaration("void somthing()");
            }
            : type identifier '(' formalParameters ')'
            ;

formalParameters : compoundType identifier formals*
                 |
                 ;

formals : ',' compoundType identifier ;

compoundType returns [BaseType basetype]
        : ultype = TYPE { basetype = new BaseType(ultype); }
        | TYPE '[' INTEGERCONST ']'  // ArrayType?
        ;

functionBody returns [FunctionBody body]
            @init{
                body = new FunctionBody();
            }
            : '{' (vardec = varDec {body.addDeclaration(vardec);})* (s = statement {body.addStatement(s);})* '}'
            ;

//return single obj?
varDec returns [VariableDeclaration vardec]
        : ct = compoundType id = identifier ';' {vardec = new VariableDeclaration(ct, id);}
        ;

statement returns [Statement s]
        : ';'
        | exp = expr ';'
        | 'print' expr ';'
        | 'println' expr ';'
        | id = identifier '=' exp = expr ';'
        | identifier '[' expr ']' '=' expr ';'
        | 'return' ';'
        | 'return' expr ';'
        | WHILE '(' expr ')' block
        | IF '(' expr ')' block ELSE block
        | IF '(' expr ')' block
        ;

block : '{' statement* '}'
      ;

exprList : expr exprMore*
        |
        ;

baseExp returns [BaseExpression exp]
        : ident = identifier { exp = new ULIdentifier(ident); }
        | literal
        | '(' expr ')'
        | identifier '(' exprList ')'
        | identifier '[' expr ']'
        ;

exprMore : ',' expr
         ;

multExp returns [BaseExpression exp]
        @init{
                BaseExpression subtree = null;
        }
        @after{
                return subtree; 
        }
        : e1 = baseExp { subtree = e1; } ('*' e2 = baseExp {subtree = new MultExp(e1, e2); })*
        ;

addExp returns [BaseExpression exp]
        @init{
            BaseExpression subtree = null;
        }
        @after{
            return subtree;
        }                                 
        : e1 = multExp { subtree = e1; } (('+'|'-') e2 = multExp { subtree = new AddExp(e1, e2); })*
        ;


equalityLT returns [BaseExpression exp]
            : addExp ('<' addExp)*
            ;

equalityExp returns [BaseExpression exp]
        @init{
                BaseExpression subtree = null; 
        }
        @after{
                return subtree; 
        }        
        : e1 = equalityLT { subtree = e1; } ( '==' e2 = equalityLT { subtree = new EqualityEqExp(e1, e2); })?
        ;

expr returns [BaseExpression exp]
     : equalityExp
     | identifier '(' exprList ')'
     | identifier '[' expr ']'
     ;

identifier returns [ULIdentifier ulid]
        : id_token = ID { ulid = new ULIdentifier(id_token); }
        ;

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
