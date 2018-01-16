package ast;

import org.antlr.runtime.Token;


public abstract class UnaryExpression extends BaseExpression {

    BaseExpression operand;

    public UnaryExpression(BaseExpression exp) {
        this.operand = exp;
    }
}
