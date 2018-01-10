package ast;

import java.util.*;


public class Program {

    Set<Function> functionSet;

    public Program() {
        functionSet = new HashSet<Function>();
    }

    public void append(Function f) {
        System.out.println("Adding this function!"); //only called for the last function found
        this.functionSet.add(f);
    }

    public String toString() {
        String r = "";
        for (Function f : functionSet)
            r += f.toString();

        return r;
    }
}
