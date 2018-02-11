package ast;
 
import java.util.ArrayList;
import java.util.Iterator;

public class ParamList extends AST implements Iterable<Param> {

    ArrayList<Param> formals;
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

    void accept(PPVisitor v) {
        v.visit(this);
    }
    
    public int size() {
        return this.size; 
    }
}