package ast;

import types.*; 

public class IRBase {

    protected String convertTypeToIrString(Type t) {
        if (t instanceof BoolType) {
            return "Z"; 
        }
        if (t instanceof CharType) {
            return "C"; 
        }
        if (t instanceof IntegerType) {
            return "I"; 
        }
        if (t instanceof FloatType) {
            return "F"; 
        }
        if (t instanceof VoidType) {
            return "V"; 
        }
        if (t instanceof StringType) {
            return "U"; // ?
        }
        if (t instanceof ArrayType) { 
            return "A" + this.convertTypeToIrString(((ArrayType)t).type); 
        }
        return "ERRORROROROEOROEROEOEROEROEROEOREORO"; 
    }
}