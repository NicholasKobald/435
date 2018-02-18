package ast;

import types.Type; 

public abstract class BaseExpression { 

    public abstract String toCodeString();

    Type accept(TypeCheckVisitor v) throws BaseULException {
        System.out.println("BE accept TCV called");
        return v.verify(this); 
    }
}
