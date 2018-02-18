package ast;

import org.antlr.runtime.Token;

import types.IntegerType;

public class ULInteger extends UnaryExpression {

    public IntegerType type;

    public ULInteger(Token token, IntegerType it) {
        super(token);
        this.type = it; 
    }
}