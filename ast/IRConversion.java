package ast;

import types.Type; 


public class IRConversion extends Instruction {

    Temp res;
    Type from;
    Type to;
    Temp t;

    public IRConversion(Temp res, Type from, Type to, Temp t) {
        this.res = res;
        this.from = from;
        this.to = to;
        this.t = t;
    }

    @Override
    public String toString() {
        return String.format("%s := %s2%s %s;", res.toCodeString(), 
            this.convertTypeToIrString(from), this.convertTypeToIrString(to), t.toCodeString()); 
    }

    public String[] getJasminStrings() {
        return new String[] {
            String.format("%s %d", this.convertTypeToLoadString(from), t.tempId), 
            String.format("%s2%s", this.toJasminType(from), this.toJasminType(to)), 
            String.format("%s %d", this.convertTypeToStoreString(to), res.tempId), 
        };
    }
}