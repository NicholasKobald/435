package ast;

import org.antlr.runtime.Token;

import types.CharType;

public class ULChar extends UnaryExpression {

    private CharType type; 

    public ULChar(Token token, CharType ct) {
        super(token);
        this.type = ct; 
    }
}