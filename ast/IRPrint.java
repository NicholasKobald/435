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

    public String[] getJasminStrings() {
        String ln = this.nl ? "ln" : ""; 
        return new String[] {"getstatic java/lang/System/out Ljava/io/PrintStream;",  
                String.format("%s %s", this.convertTypeToLoadString(t),  Integer.toString(op.tempId)), 
                String.format("invokevirtual java/io/PrintStream/print%s(%s)V", ln, this.convertTypeToIrString(t)),
         };  
    }
}