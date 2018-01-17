package ast;

import org.antlr.runtime.Token;


public class SubExp extends BinaryExpression {

    public SubExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
    }
}
