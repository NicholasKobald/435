package types;


public class ArrayType extends Type {

    int size;
    Type type; 

    public ArrayType(Type type, int size) {
        this.type = type;
        this.size = size; 
    }
}