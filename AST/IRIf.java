package ast;


public class IRIf extends Instruction {

    Temp cond;
    IRLabel label;

    public IRIf(Temp cond, IRLabel label) {
        this.cond = cond;
        this.label = label;
    }

    public String toString() {
        return String.format("IF %s GOTO %s;", cond.toCodeString(), label.refToString());
    }

}