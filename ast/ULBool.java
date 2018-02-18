package ast;

import org.antlr.runtime.Token;

import types.BoolType;
import types.Type; 

public class ULBool extends UnaryExpression {

    public BoolType type; 

    public ULBool(Token token, BoolType bt) {
        super(token);
        this.type = bt;  
    }

    Type accept(TypeCheckVisitor v) throws BaseULException {
        return v.verify(this);
    }
}