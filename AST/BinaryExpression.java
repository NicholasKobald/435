package ast;

import org.antlr.runtime.Token;


public abstract class BinaryExpression extends BaseExpression {

    BaseExpression operand_one;
    BaseExpression operand_two;

    public BinaryExpression(BaseExpression exp, BaseExpression exp1) {
        this.operand_one = exp;
        this.operand_two = exp1;
    }
}
