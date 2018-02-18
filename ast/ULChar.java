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

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}