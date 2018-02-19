package ast;

import ast.StatementList;

import types.Type; 

public class If extends BaseStatement {

    BaseExpression cond;
    StatementList statements;
    StatementList elseStatements; 

    // if {} 
    public If(BaseExpression cond, StatementList stats) {
        this.cond = cond; 
        this.statements = stats;
        this.elseStatements = null;  
    }

    // if {} else {} 
    public If(BaseExpression cond, StatementList stats, StatementList elseStats) {
        this.cond = cond; 
        this.statements = stats;
        this.elseStatements = elseStats;  
    }

    public String toCodeString() {
        return String.format("if (%s)", cond.toCodeString());
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}