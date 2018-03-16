package ast;

import java.util.ArrayList;
import java.util.Iterator; 
import java.util.Set; 
import java.util.HashSet;


public class Program extends AST implements Iterable<Function> {

    ArrayList<Function> functionList;

    public Program() {
        this.functionList = new ArrayList<Function>();
    }

    public void append(Function f) {
        this.functionList.add(f);
    }

    public String toString() {
        String r = "";
        for (Function f : functionList)
            r += f.toString();

        return r;
    }

    @Override
    public Iterator<Function> iterator() {
        return functionList.iterator(); 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }
    
    void accept(IRGenVisitor v) throws BaseULException {
        v.gen(this); 
    }
}
