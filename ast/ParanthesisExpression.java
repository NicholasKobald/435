package ast;


public class ParanthesisExpression extends BaseExpression {

    BaseExpression wrapped_expr;

    public ParanthesisExpression(BaseExpression e) {
        this.wrapped_expr = e; 
    }
    
    public String toCodeString() {
        return String.format("(%s)", this.wrapped_expr.toCodeString()); 
    }
}