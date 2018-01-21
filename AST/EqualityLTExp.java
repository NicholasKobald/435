package ast;

import org.antlr.runtime.Token;


public class EqualityLTExp extends BinaryExpression {

    public EqualityLTExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
        this.operator = "<";
    }
}
