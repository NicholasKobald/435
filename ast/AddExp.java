package ast;

import types.Type; 

public class AddExp extends BinaryExpression {

    public AddExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
        this.operator = "+";         
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        System.out.println("Checking addexp");
        return v.verify(this); 
    }
} 