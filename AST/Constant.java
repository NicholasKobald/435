package ast;

import org.antlr.runtime.Token;


public class Constant extends UnaryExpression {

    BaseExpression operand;

    public Constant(BaseExpression exp) {
        super(exp);
    }
}
