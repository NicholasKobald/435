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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (!(o instanceof Param)) return false; 
        
        Param param = (Param)o; 
        return this.id.equals(param.id.toString()) && this.type == param.type; 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }
}