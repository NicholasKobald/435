package ast;

import types.Type; 

public class IRArrayDec extends Instruction { 

    Temp var;
    Type at;
    int size;

    public IRArrayDec(Temp var, Type at, int size) {
        this.var = var; 
        this.at = at;
        this.size = size; 
    }

    public String toString() {
        return String.format("%s := NEWARRAY %s %s;",
            var.toCodeString(), this.convertTypeToIrString(at), Integer.toString(size)); 
    }
}