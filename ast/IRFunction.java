package ast;

import java.util.LinkedList;

import types.*;

public class IRFunction extends IRBase {

        public LinkedList<Temp> tempList;
        public LinkedList<Instruction> instructionList;
        public LinkedList<IRArrayDec> arrayDecs; 
        public Type t; 
        public String functionName; 
        public ParamList pl; 

        public IRFunction(Type t, String n, ParamList pl) {
            this.tempList = new LinkedList<Temp>();
            this.instructionList = new LinkedList<Instruction>(); 
            this.arrayDecs = new LinkedList<IRArrayDec>();
            this.t = t; 
            this.functionName = n; 
            this.pl = pl; 
        }

        public int numTemps() {
            return this.tempList.size(); 
        }

        public void addTemp(Temp t) {
            tempList.add(t); 
        }

        public void addInstruction(Instruction i) {
            instructionList.add(i); 
        }

        public void addArrayDec(IRArrayDec ad) {
            arrayDecs.add(ad); 
        }

        public Temp getTempById(int id) {
            return tempList.get(id); 
        }

        public String toString() {
            String s = String.format("FUNC %s (%s)%s\n{\n", functionName, this.paramTypeString(), this.convertTypeToIrString(t));
            for (Temp t: tempList) {
                s += "    " + t.toString();
                s += "\n"; 
            }

            for (IRArrayDec d: arrayDecs) {
                s += "    " + d.toString();
                s += "\n"; 
            }

            for (Instruction i: instructionList) {
                s += "    " + i.toString(); 
                s += "\n"; 
            }
            s += "}\n"; 
            return s; 
        }

        public String paramTypeString() {
            String s = "";
            for (Param p: pl) {
                s += this.convertTypeToIrString(p.type); 
            }
            return s; 
        }

}