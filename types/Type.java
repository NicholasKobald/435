package types;


public abstract class Type {

    public abstract String toCodeString(); 

    public String toString() {
        return "type: <"  + this.getClass().getSimpleName() + ">"; 
    }   

    public String toJVMString() {
        return this.toCodeString(); 
    }
}