package ast;

import types.Type; 

public class IRPrint extends Instruction { 

    Type t;
    Temp op;
    boolean nl;

    public IRPrint(Temp op, Type t, boolean newLine) {
        this.t = t;
        this.op = op;
        this.nl = newLine; 
    }

    public String toString() {
        String ln = this.nl ? "LN" : ""; 
        return String.format("PRINT%s%s %s;",
            ln, this.convertTypeToIrString(t), op.toCodeString()); 
    }
}