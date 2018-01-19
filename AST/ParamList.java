package ast;

import java.util.ArrayList;

public class ParamList extends AST {

    ArrayList<Param> formals;

    public ParamList() {
        formals = new ArrayList<Param>(); 
    }

    public void append(Param p) {
        this.formals.add(p); 
    }
}