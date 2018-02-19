package ast;

import types.Type; 

public class FunctionCall extends BaseExpression {

    ULIdentifier id; 
    ExpressionList expList; 

    public FunctionCall(ULIdentifier id, ExpressionList expList) {
        this.id = id; 
        this.expList = expList; 
    }

    public String toCodeString() {
        return String.format("%s(%s)", this.id.toCodeString(), this.expList.toCodeString()); 
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}