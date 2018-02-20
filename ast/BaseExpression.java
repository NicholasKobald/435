package ast;

import types.Type; 

public abstract class BaseExpression extends BaseStatement { 

    public abstract String toCodeString();

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this); 
    }
}
