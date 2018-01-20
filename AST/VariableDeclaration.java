package ast;

import types.Type; 

public class VariableDeclaration {

    Type type;
    ULIdentifier id;

    public VariableDeclaration(Type type, ULIdentifier id) {
        this.type = type;
        this.id = id;
    }

    public String toString() {
        //ie: int my_variable;
        return String.format("%s %s;\n", type.toString(), id.toString());
    }
}
