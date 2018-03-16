package ast;

import types.Type; 

public abstract class BaseExpression extends BaseStatement { 

    public abstract String toCodeString();

    void accept(PPVisitor v) {
        v.visit(this);
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this); 
    }

    Temp accept(IRGenVisitor v) throws BaseULException {
        return v.gen(this); 
    }
}
