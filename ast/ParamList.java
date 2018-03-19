package ast;
 
import java.util.ArrayList;
import java.util.Iterator;

public class ParamList extends AST implements Iterable<Param> {

    public ArrayList<Param> formals;
    private int size; 

    public ParamList() {
        this.size = 0;
        formals = new ArrayList<Param>(); 
    }

    public void append(Param p) {
        this.formals.add(p);
        this.size += 1;  
    }

    @Override
    public Iterator<Param> iterator() {
        return formals.iterator(); 
    }

    public int size() {
        return this.size; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (!(o instanceof ParamList)) return false; 
        
        ParamList pl = (ParamList)o; 

        // concern ourselves with the types of the parameters 
        // if same number of params, and the types of each are the same
        // consider them to be identical 
        if (pl.size() != this.size) return false; 
        for (int i = 0; i < this.size; i++) {
            if (this.formals.get(i).type != pl.formals.get(i).type) {
                return false; 
            }   
        }

        return true; 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }
}