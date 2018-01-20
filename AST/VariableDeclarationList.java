package ast;

import java.util.ArrayList;
import java.util.Iterator;


public class VariableDeclarationList extends AST implements Iterable<VariableDeclaration> {

    ArrayList<VariableDeclaration> variableDeclarations;

    public VariableDeclarationList() {
        variableDeclarations = new ArrayList<VariableDeclaration>();
    }

    public void append(VariableDeclaration dec) {
        variableDeclarations.add(dec);
    }

    public Iterator<VariableDeclaration> iterator() {
        return variableDeclarations.iterator(); 
    }

    public String toString() {
        String ret_str = "";
        if (variableDeclarations == null || variableDeclarations.size() == 0)
            return ret_str;

        for (VariableDeclaration vd: variableDeclarations)
            ret_str += "    " + vd.toString(); // four spaces of indent

        return ret_str;
    }
}
