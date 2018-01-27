package ast;
 
import java.util.ArrayList;
import java.util.Iterator;

public class ParamList extends AST implements Iterable<Param> {

    ArrayList<Param> formals;

    public ParamList() {
        formals = new ArrayList<Param>(); 
    }

    public void append(Param p) {
        this.formals.add(p); 
    }

    @Override
    public Iterator<Param> iterator() {
        return formals.iterator(); 
    }

    void accept(PPVisitor v) {
        v.visit(this);
    }   
}