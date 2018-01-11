package ast;

import java.util.*;


public class StatementList {

    ArrayList<Statement> sl;

    public StatementList() {
        this.sl = new ArrayList<Statement>();
    }

    public void append(Statement s) {
        this.sl.add(s);
    }

    public String toString() {
        String statementString = "";
        if (this.sl == null || this.sl.size() == 0)
            return statementString;

        String indent = "    "; //four spaces
        for (Statement s: sl)
            statementString += indent + s.toString();

        return statementString;
    }
}
