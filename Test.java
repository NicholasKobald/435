import types.Type; 
import types.BoolType;


public class Test {

    public static void main(String[] args) {
        System.out.println("Success?");
        BoolType mybool = new BoolType("Straaahng");
        System.out.println("Success!");
        compoundType(); 
        System.out.println(mybool.toString());
    }
    
    public static final Type compoundType() {
        System.out.println("Whatevers");
        return new BoolType("Truuuuu"); 
    }
}