package types; 


public class StringType extends Type {

    public String toCodeString() {
        return "string"; 
    }

    public String toJVMString() {
        return "java/lang/String"; 
    }
}