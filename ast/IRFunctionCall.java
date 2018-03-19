package ast;

import java.util.LinkedList;


public class IRFunctionCall extends Instruction {

    LinkedList<Temp> params; 
    String funcName;
    Temp operand;

    public IRFunctionCall(Temp operand, String funcName, LinkedList<Temp> params) {
        this.funcName = funcName;
        this.params = params; 
        this.operand = operand; 
    }

    public String toString() {
        if (operand != null) 
            return String.format("%s := CALL %s(%s);", 
                operand.toCodeString(), funcName, this.getTempListString());
        else
            return String.format("CALL %s(%s);",
                funcName, this.getTempListString()); 
    }

    private String getTempListString() {
        String s = "";
        for (Temp t: params) {
            s += t.toCodeString(); 
        }
        return s; 
    }
}