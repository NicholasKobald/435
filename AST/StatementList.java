package ast;

import java.util.ArrayList;
import java.util.Iterator; 


public class StatementList extends AST implements Iterable<BaseStatement> {

    ArrayList<BaseStatement> sl;

    public StatementList() {
        this.sl = new ArrayList<BaseStatement>();
    }

    public void append(BaseStatement s) {
        this.sl.add(s);
    }

    @Override
    public Iterator<BaseStatement> iterator() {
        return sl.iterator(); 
    }

    public String toString() {
        String statementString = "";
        if (this.sl == null || this.sl.size() == 0)
            return statementString;

        String indent = "    "; //four spaces
        for (BaseStatement s: sl)
            statementString += indent + s.toString();

        return statementString;
    }
}
