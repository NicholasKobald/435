package ast;


public class ExpressionStatement extends BaseStatement {

    BaseExpression exp;

    public ExpressionStatement(BaseExpression exp) {
        this.exp = exp; 
    }
}