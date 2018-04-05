package ast;

import types.*; 

public class Temp extends IRBase {
    
    public Type type;
    public int tempId;

    public Temp(Type t, int tempId) {
        this.type = t; 
        this.tempId = tempId; 
    }

    public String declarationToString() {
        return String.format("TEMP %s:%s;", Integer.toString(tempId), this.convertTypeToIrString(type));
    }

    public String toString() {
        return this.declarationToString(); 
    }
    
    public String toCodeString() {
        return String.format("T%s", Integer.toString(tempId)); 
    }
}