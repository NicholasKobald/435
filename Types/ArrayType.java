package types;


public class ArrayType extends BaseType {

    int size;
    BaseType type; 

    public ArrayType(BaseType type, int size) {
        this.type = type;
        this.size = size; 
    }
}