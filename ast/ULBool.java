package ast;

import org.antlr.runtime.Token;

import types.BoolType;

public class ULBool extends UnaryExpression {

    public BoolType type; 

    public ULBool(Token token, BoolType bt) {
        super(token);
        this.type = bt;  
    }

}