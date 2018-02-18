package ast;

import types.Type; 

public abstract class BaseExpression { 

    public abstract String toCodeString();

    public Type accept(TypeCheckVisitor v) {
        return v.verify(this); 
    }
}
