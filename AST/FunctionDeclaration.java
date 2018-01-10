package ast;

public class FunctionDeclaration {

    String temp;

    public FunctionDeclaration(String dec) {
        this.temp = dec;
    }

    public String toString() {
        return this.temp;
    }
}
