package ast;

public class BaseType {

    // because why not make a String wrapper?
    String s;

    public BaseType(String s) {
        this.s = s;
    }

    public String toString() {
        return this.s;
    }
}
