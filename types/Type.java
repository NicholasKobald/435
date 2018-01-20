package types;


public abstract class Type {

    public String toString() {
        return "type: <"  + this.getClass().getSimpleName() + ">"; 
    }   
}