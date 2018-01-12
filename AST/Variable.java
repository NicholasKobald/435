package ast;


public class Variable {

    String type;
    String identifier;

    public Variable(String type, String id) {
        this.type = type;
        this.identifier = id;
    }

    public String toString() {
        return this.identifier;
    }

    public String getType() {
        return this.type;
    }
}
