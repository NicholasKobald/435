package ast;

import types.Type; 


public class ArrayAssignment extends BaseStatement {

    ULIdentifier ulid;
    BaseExpression indexExp;
    BaseExpression expression; 

    public ArrayAssignment(ULIdentifier id, BaseExpression indexExp, BaseExpression exp) {
        this.ulid = id; 
        this.indexExp = indexExp;  
        this.expression = exp;
        this.lineNumber = id.getLineNumber();
        this.lineColumn = id.getColumn(); 
    }

    public String toCodeString() {
        return String.format("%s[%s] = %s", this.ulid.toCodeString(), this.indexExp.toCodeString(), this.expression.toCodeString());
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