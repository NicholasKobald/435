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

formalParameters 
        : compoundType identifier formals*
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

statement returns [BaseStatement basestatement]
        @init{
                BaseStatement s = null; 
        }
        @after{
                return s; 
        }
        : ';' 
        | exp = expr ';'                                          { s = new ExpressionStatement(exp); } 
        | 'print' exp = expr ';'                                  { s = new Print(exp, false); }
        | 'println' exp = expr ';'                                { s = new Print(exp, true);  }
        | id = identifier '=' ex1 = expr ';'                      { s = new Assignment(id, ex1); }
        | id = identifier '[' index = expr ']' '=' ex1 = expr ';' { s = new ArrayAssignment(id, index, ex1); }
        | 'return' ';'                                            { s = new Return(); }
        | 'return' expr ';'                                       { s = new Return(exp); }
        | WHILE '(' exp = expr ')' stats = block                  { s = new While(exp, stats); }
        | IF '(' exp = expr ')' stats = block ELSE stats2 = block { s = new If(exp, stats, stats2); }
        | IF '(' exp = expr ')' stats = block                     { s = new If(exp, stats); }            
        ;

block returns [StatementList stats]
        @init{
                stats = new StatementList();
        }
        @after{
                return stats; 
        }
        :  '{' (s = statement {stats.append(s);})* '}'
        ;

exprList returns [ExpressionList explist]
        @init{
                ExpressionList explist = null; 
        }
        @after{
                return explist; 
        }
        : expr exprMore*
        |
        ;

baseExp returns [BaseExpression exp]
        @init{
                BaseExpression atom = null; 
        }
        @after{
                return atom; 
        }
        : ident = identifier { atom = ident; }
        | lit = literal      { atom = lit;   }
        | '(' atomic_expr = expr ')'  { atom = atomic_expr;    }         
        | id = identifier '(' exprList ')' { atom = new FunctionCall(id, exprlist); } // TODO 
        | identifier '[' expr ']' { atom = null; } 
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

literal returns [BaseExpression exp]
        : t = STRINGCONST  { exp = new ULString(t.getText());  }
        | t = INTEGERCONST { exp = new ULInteger(t.getText()); }
        | t = FLOATCONST   { exp = new ULFloat(t.getText());   }
        | t = CHARCONST    { exp = new ULChar(t.getText());    }
        | t = TRUE         { exp = new ULBool(t.getText());    }
        | t = FALSE        { exp = new ULBool(t.getText());    }
        ;

IF      : 'if'
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
