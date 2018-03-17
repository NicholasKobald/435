package ast;

public class IRGoto extends Instruction {

    IRLabel label;

    public IRGoto(IRLabel l) {
        this.label = l; 
    }

    public String toString() {
        return String.format("GOTO %s;", label.refToString()); 
    }
}