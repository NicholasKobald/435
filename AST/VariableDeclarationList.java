package ast;

import java.util.*;

public class VariableDeclarationList {

    ArrayList<VariableDeclaration> arr;

    String temp;

    public VariableDeclarationList(String t) {
        System.out.println("Initialized with " + t);
        this.temp = t;
    }

    public String toString() {
        if (temp == null) {
            return "";
        }
        return this.temp;
    }
}
