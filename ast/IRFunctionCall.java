package ast;

import java.util.LinkedList;
import java.util.ArrayList; 
import types.Type; 


public class IRFunctionCall extends Instruction {

    LinkedList<Temp> params; 
    String funcName;
    Temp operand;
    Type functype;
    String cn; 

    public IRFunctionCall(Temp operand, String funcName, LinkedList<Temp> params, Type functype, String cn) {
        this.funcName = funcName;
        this.params = params; 
        this.operand = operand; 
        this.functype = functype;
        this.cn = cn; 
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

    public String[] getJasminStrings() {
        ArrayList<String> tmp = new ArrayList<String>(); 
        
        for (Temp t: params) 
            tmp.add(String.format("%s %d", this.convertTypeToLoadString(t.type), t.tempId));

        tmp.add(String.format("invokestatic %s/%s(%s)%s", 
            this.cn, this.funcName, this.tempTypeString(), this.convertTypeToIrString(this.functype))); 

        if (operand != null) {
            tmp.add(String.format("%s %d", this.convertTypeToStoreString(operand.type), operand.tempId)); 
        }

        return tmp.toArray(new String[tmp.size()]); 
    }

    public String tempTypeString() {
        String s = "";
        for (Temp p: params) {
            s += this.convertTypeToIrString(p.type); 
        }
        return s; 
    }
}