package ast;

import java.util.*;

public class VariableDeclarationList {

    ArrayList<VariableDeclaration> variableDeclarations;

    public VariableDeclarationList() {
        variableDeclarations = new ArrayList<VariableDeclaration>();
    }

    public void append(VariableDeclaration dec) {
        //System.out.println("Added a declaration to the listtt");
        variableDeclarations.add(dec);
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
