package ast;

import org.antlr.runtime.Token;

import types.StringType;


public class ULString extends UnaryExpression {

    public StringType type; 

    public ULString(Token token, StringType st) {
        super(token);
        this.type = st; 
    }
}