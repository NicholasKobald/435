package ast;

import types.Type; 


public class ArrayExpression extends BaseExpression {

    ULIdentifier id;
    BaseExpression index; 
    public Type atomicType; 

    public ArrayExpression(ULIdentifier id, BaseExpression index) {
        this.id = id;
        this.index = index; 
        this.lineNumber = id.getLineNumber();
        this.lineColumn = id.getColumn(); 
    }

    public String toCodeString() {
        return String.format("%s[%s]", this.id.toCodeString(), this.index.toCodeString()); 
    }

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