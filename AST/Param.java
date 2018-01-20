package ast; 

import types.Type;


public class Param extends AST {

    ULIdentifier id;
    Type type; 

    public Param(ULIdentifier id, Type type) {
        this.id = id; 
        this.type = type; 
    }

    public String toString() {
        return String.format("%s %s", this.type.toCodeString(), this.id.toString()); 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }   
}