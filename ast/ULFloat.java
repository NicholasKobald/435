package ast;

import org.antlr.runtime.Token;

import types.FloatType; 


public class ULFloat extends UnaryExpression {

    public FloatType type;

    public ULFloat(Token token, FloatType ft) {
        super(token);
        this.type = ft; 
    }
}