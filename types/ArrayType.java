package types;

import org.antlr.runtime.Token;


public class ArrayType extends Type {

    int size;
    Type type; 

    public ArrayType(Type type, Token integerconst) {
        this.type = type;
        this.size = Integer.parseInt(integerconst.getText()); 
    }

    public String toCodeString() {
        return String.format("%s[%d]", this.type.toCodeString(), size); 
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false; 
        if (!(o instanceof ArrayType)) return false;
        if (o == this) return true; 
        ArrayType at = (ArrayType)o;
         
        return this.type == at.type && this.size == at.size; 
    }
}