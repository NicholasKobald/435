package types; 


public class BoolType extends Type {

    String tok;
    Boolean val;

    public BoolType(String t) {
        this.tok  = t; 
        this.val = true; 
    }

    public String toString() {
        return "true"; 
    }
}