package ast;

import types.Type; 

public abstract class BaseExpression { 

    public abstract String toCodeString();

    public int lineNum = 0;

    public int getLineNumber() {
        return this.lineNum; 
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this); 
    }
}
