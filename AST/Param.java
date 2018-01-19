package ast; 

public class Param extends AST {

    ULIdentifier id;
    BaseType type; 

    public Param(ULIdentifier id, BaseType type) {
        this.id = id; 
        this.type = type; 
    }
}