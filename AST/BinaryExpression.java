package ast;

import org.antlr.runtime.Token;


public abstract class BinaryExpression extends BaseExpression {

    BaseExpression operand_one;
    BaseExpression operand_two;
    protected String operator; 

    public BinaryExpression(BaseExpression exp, BaseExpression exp1) {
        this.operand_one = exp;
        this.operand_two = exp1;
    }

    public String toCodeString() {
        return String.format("%s %s %s", this.operand_one.toCodeString(), this.operator, this.operand_two.toCodeString()); 
    }
}
