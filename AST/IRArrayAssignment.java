package ast;

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
}