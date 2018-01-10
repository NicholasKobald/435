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
        if (this.sl == null || this.sl.size() == 0) {
            return "";
        }
        String statementString = "";
        for (Statement s: sl) {
            statementString += sl.toString();
        }
        return statementString;
    }
}
