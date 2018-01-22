package ast;

public class ArrayAssignment extends BaseStatement {

    ULIdentifier ulid;
    BaseExpression indexExp;
    BaseExpression expression; 

    public ArrayAssignment(ULIdentifier id, BaseExpression indexExp, BaseExpression exp) {
        this.ulid = id; 
        this.indexExp = indexExp;  
        this.expression = exp; 
    }

    public String toCodeString() {
        return String.format("%s[%s] = %s", this.ulid.toCodeString(), this.indexExp.toCodeString(), this.expression.toCodeString());
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }
}