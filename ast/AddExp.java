package ast;

import types.Type; 

public class AddExp extends BinaryExpression {

    public AddExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
        this.operator = "+";    
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this); 
    }
} 