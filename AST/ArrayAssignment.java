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
}