package ast;

public class VariableDeclaration {

    BaseType type;
    ULIdentifier id;

    public VariableDeclaration(BaseType type, ULIdentifier id) {
        this.type = type;
        this.id = id;
    }

    public String toString() {
        //ie: int my_variable;
        return String.format("%s %s;", type.toString(), id.toString());
    }
}
