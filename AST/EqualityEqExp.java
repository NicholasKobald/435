package ast;

import org.antlr.runtime.Token;


public class EqualityEqExp extends BinaryExpression {

    public EqualityEqExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
    }
}
