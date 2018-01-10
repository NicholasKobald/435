package ast;

import java.util.*;

public class VariableDeclarationList {

    ArrayList<VariableDeclaration> variableDeclarations;

    String temp;

    public VariableDeclarationList(String t) {
        System.out.println("Initialized with " + t);
        this.temp = t;
    }

    public void add(VariableDeclaration dec) {
        variableDeclarations.add(dec);
    }

    public String toString() {
        String ret_str = "";
        if (variableDeclarations == null || variableDeclarations.size() == )
            return ret_str;

        for (VariableDeclaration vd: variableDeclarations)
            ret_str += vd.ToString();

        return ret_str;
    }
}
