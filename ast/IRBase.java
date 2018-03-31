package ast;

import types.*; 

public class IRBase {

    public String toCodeString() {
        return "You have called the Base toCodeString(). Something probably went wrong"; 
    }

   /* public String [] getJasminStrings() {
        return new String[] {"You have called the base toJasminString method"
               + " Is it possible you have forgotten to implement this function" 
               + " correctly on some IR class?"}; 
    } */

    protected String convertTypeToStoreString(Type t) {
        if (t instanceof IntegerType || t instanceof CharType || t instanceof BoolType) 
            return "istore";
        if (t instanceof FloatType)
            return "fstore";
        if (t instanceof StringType) 
            return "astore"; 
        return "Called convert type to store string with an unsupported type";
    }


    protected String convertTypeToLoadString(Type t) {
        if (t instanceof IntegerType || t instanceof CharType || t instanceof BoolType) 
            return "iload";
        if (t instanceof FloatType)
            return "fload";
        if (t instanceof StringType) 
            return "aload"; 
        return "Called convert type to store string with an unsupported type";
    }


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
            return "Ljava/lang/String;"; // ?
        }
        if (t instanceof ArrayType) { 
            return "A" + this.convertTypeToIrString(((ArrayType)t).type); 
        }
        return "ERRORROROROEOROEROEOEROEROEROEOREORO"; 
    }
}