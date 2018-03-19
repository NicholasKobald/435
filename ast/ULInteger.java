package ast;

import org.antlr.runtime.Token;

import types.IntegerType;
import types.Type; 

public class ULInteger extends UnaryExpression {

    public IntegerType type;

    public ULInteger(Token token, IntegerType it) {
        super(token);
        this.type = it; 
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }

    Temp accept(IRGenVisitor v) throws BaseULException {
        return v.gen(this); 
    }
}