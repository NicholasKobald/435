package ast;

import types.Type; 

public class AddExp extends BinaryExpression {

    public AddExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
        this.operator = "+";         
    }

    Type accepts(TypeCheckVisitor v) {
        System.out.println("accepting add exp");
        return v.verify(this); 
    }
} 