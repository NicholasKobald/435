package ast;

public class IRTempToTempAssignment extends Instruction { 
    
    Temp lhs;
    Temp rhs;

    public IRTempToTempAssignment(Temp lhs, Temp rhs) {
        this.lhs = lhs;
        this.rhs = rhs; 
    }

    public String toString() {
        return String.format("%s := %s;", lhs.toCodeString(), rhs.toCodeString()); 
    }

    @Override
    public String[] getJasminStrings() {
        return new String [] {
            String.format("%s %d", this.convertTypeToLoadString(rhs.type), rhs.tempId),
            String.format("%s %d", this.convertTypeToStoreString(lhs.type), lhs.tempId) 
        };
    }
}