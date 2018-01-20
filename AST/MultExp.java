package ast;

import org.antlr.runtime.Token;


public class MultExp extends BinaryExpression { 

    public MultExp(BaseExpression exp, BaseExpression exp1) {
        super(exp, exp1);
    }
}