package ast;

import org.antlr.runtime.Token;

import types.Type; 

public class EqualityLTExp extends BinaryExpression {

    public EqualityLTExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
        this.operator = "<";
    }

    Type accept(TypeCheckVisitor v) throws BaseULException { 
        return v.verify(this);
    }

    Temp accept(IRGenVisitor v) throws BaseULException {
        return v.gen(this);
    }
}
