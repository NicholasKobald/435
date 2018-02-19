package ast;

import types.Type;


import org.antlr.runtime.Token;


public class SubExp extends BinaryExpression {

    public SubExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
        this.operator = "-";
    }


    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}
