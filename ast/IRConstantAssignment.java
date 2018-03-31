package ast;

public class IRConstantAssignment extends Instruction {

    Temp lhs;
    UnaryExpression rhs;

    public IRConstantAssignment(Temp lhs, UnaryExpression rhs) {
        this.lhs = lhs;
        this.rhs = rhs; 
    }
    
    public String toString() {
        return String.format("%s := %s;", lhs.toCodeString(), rhs.toCodeString()); 
    }

    @Override
    public String[] getJasminStrings() {
        return new String[] {
            String.format("ldc %s", rhs.toJasminString()),
            String.format("%s %d", this.convertTypeToStoreString(lhs.type), this.lhs.tempId), 
        }; 
    }
}