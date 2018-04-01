package ast;

import org.antlr.runtime.Token;

import types.CharType;
import types.Type; 

public class ULChar extends UnaryExpression {

    public CharType type; 

    public ULChar(Token token, CharType ct) {
        super(token);
        this.type = ct; 
    }

    public String toJasminString() {
        return Integer.toString((int)(this.toCodeString().charAt(0))); 
    }

    public String toString() {
        return this.token.getText();
    }

    public String toCodeString() {
        return this.toString(); 
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }

    Temp accept(IRGenVisitor v) throws BaseULException {
        return v.gen(this); 
    }
}