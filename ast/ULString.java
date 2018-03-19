package ast;

import org.antlr.runtime.Token;

import types.StringType;
import types.Type; 


public class ULString extends UnaryExpression {

    public StringType type; 

    public ULString(Token token, StringType st) {
        super(token);
        this.type = st; 
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }

    Temp accept(IRGenVisitor v) throws BaseULException {
        return v.gen(this); 
    }
}