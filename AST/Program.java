package ast;

import java.util.ArrayList;
import java.util.Iterator; 
import java.util.Set; 
import java.util.HashSet;


public class Program extends AST implements Iterable<Function> {

    Set<Function> functionSet;

    public Program() {
        //System.out.println("Init Program.");
        functionSet = new HashSet<Function>();
    }

    public void append(Function f) {
        //System.out.println("Adding this function!"); //only called for the last function found
        this.functionSet.add(f);
    }

    public String toString() {
        String r = "";
        for (Function f : functionSet)
            r += f.toString();

        return r;
    }

    @Override
    public Iterator<Function> iterator() {
        return functionSet.iterator(); 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }   
}
