package ast;

public class Statement {

    String test;

    //TODO
    public Statement(String s) {
        System.out.println("Created a statement!");
        this.test = s;
    }

    public String toString() {
        if (this.test == null)
            return "";

        return this.test;
    }
}
