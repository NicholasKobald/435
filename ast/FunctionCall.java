package ast;

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
}