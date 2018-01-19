package ast;

public class FunctionDeclaration extends AST {

    String temp;

    public FunctionDeclaration(String dec) {
        this.temp = dec;
    }

    public String toString() {
        return this.temp;
    }
}
