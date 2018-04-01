package ast;

import types.*; 

public class IRArrayAssignment extends Instruction {

    Temp lhs;
    Temp lhsindex;
    Temp rhs; 

    public IRArrayAssignment(Temp lhs, Temp lhsindex, Temp rhs) {
        this.lhs = lhs;
        this.lhsindex = lhsindex;
        this.rhs = rhs;         
    }

    public String toString() {
        return String.format("%s[%s] := %s;", 
            lhs.toCodeString(), lhsindex.toCodeString(), rhs.toCodeString()); 
    }
    
    public String[] getJasminStrings() {
        return new String[] {
            String.format("%s %d", this.convertTypeToLoadString(lhs.type), lhs.tempId),
            String.format("%s %d", this.convertTypeToLoadString(lhsindex.type), lhsindex.tempId),
            String.format("%s %d", this.convertTypeToLoadString(rhs.type), rhs.tempId),
            this.getArrayStore(),
        };
    }

    private String getArrayStore() {
        if (this.rhs.type instanceof CharType) {
            return "castore";
        }
        if (this.rhs.type instanceof BoolType) {
            return "bastore"; 
        }
        if (this.rhs.type instanceof IntegerType) {
            return "iastore";
        } 
        if (this.rhs.type instanceof StringType) {
            return "aastore"; 
        }
        if (this.rhs.type instanceof FloatType) {
            return "fastore"; 
        }
        return "^__^ oopsy woopsy";
    }
}