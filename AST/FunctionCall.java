package ast;

public class FunctionCall extends BaseExpression {

    ULIdentifier id; 
    ExpressionList expList; 

    public FunctionCall(ULIdentifier id, ExpressionList expList) {
        this.id = id; 
        this.expList = expList; 
    }
}