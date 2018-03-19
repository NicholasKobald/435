package ast;

import java.util.LinkedList;

import ast.IRFunction;

public class IRProgram extends IRBase {

    LinkedList<IRFunction> functionList;

    public IRProgram() {
        functionList = new LinkedList<IRFunction>();
    }

    public void addFunction(IRFunction f) {
        this.functionList.add(f); 
    }

    public String toString(String sourceName) {
        String s = "PROG\n";
        s += sourceName;
        s += "\n\n"; 
        for (IRFunction f: functionList) {
            s += f.toString(); 
            s += "\n"; 
        }
        return s; 
    }
}
