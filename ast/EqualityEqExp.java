package ast;

import org.antlr.runtime.Token;

import types.Type; 

public class EqualityEqExp extends BinaryExpression {

    public EqualityEqExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
        this.operator = "==";
    }

    Type accept(TypeCheckVisitor v) throws BaseULException { 
        return v.verify(this);
    }
}

