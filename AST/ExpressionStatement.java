package ast;


public class ExpressionStatement extends BaseStatement {

    BaseExpression exp;

    public ExpressionStatement(BaseExpression exp) {
        this.exp = exp; 
    }

    public String toCodString() {
        if (exp == null) 
            return "";

        return String.format("%s", exp.toCodeString());
    }
}