package ast;

public class ArrayExpression extends BaseExpression {

    ULIdentifier id;
    BaseExpression index; 

    public ArrayExpression(ULIdentifier id, BaseExpression index) {
        this.id = id;
        this.index = index; 
    }
}