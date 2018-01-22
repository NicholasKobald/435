package types;

import org.antlr.runtime.Token;


public class ArrayType extends Type {

    int size;
    Type type; 

    public ArrayType(Type type, Token integerconst) {
        this.type = type;
        this.size = Integer.parseInt(integerconst.getText()); // TODO: cast  
    }

    public String toCodeString() {
        return String.format("%s[%d]", this.type.toCodeString(), size); 
    }
}