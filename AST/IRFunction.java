package ast;

import java.util.LinkedList;

import types.*;

public class IRFunction extends IRBase {

        LinkedList<Temp> tempList;
        LinkedList<Instruction> instructionList;
        Type t; 
        String functionName; 
        ParamList pl; 

        public IRFunction(Type t, String n, ParamList pl) {
            this.tempList = new LinkedList<Temp>();
            this.instructionList = new LinkedList<Instruction>(); 
            this.t = t; 
            this.functionName = n; 
            this.pl = pl; 
        }

        public void addTemp(Temp t) {
            tempList.add(t); 
        }

        public void addInstruction(Instruction i) {
            instructionList.add(i); 
        }

        public Temp getTempById(int id) {
            // hope this works? make
            return tempList.get(id); 
        }

        public String toString() {
            String s = String.format("FUNC %s (%s)%s\n{\n", functionName, this.paramTypeString(), this.convertTypeToIrString(t));
            for (Temp t: tempList) {
                s += "    " + t.toString();
                s += "\n"; 
            }
            for (Instruction i: instructionList) {
                s += i.toString(); 
                s += "\n"; 
            }
            s += "}\n"; 
            return s; 
        }

        private String paramTypeString() {
            String s = "";
            for (Param p: pl) {
                s += this.convertTypeToIrString(p.type); 
            }
            return s; 
        }
}