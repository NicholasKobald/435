package ast;

public class ArrayExpression extends BaseExpression {

    ULIdentifier id;
    BaseExpression index; 

    public ArrayExpression(ULIdentifier id, BaseExpression index) {
        this.id = id;
        this.index = index; 
    }

    public String toCodeString() {
        return String.format("%s %s", this.id.toCodeString(), this.index.toCodeString()); 
    }
}