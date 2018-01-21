package ast;

import java.util.Iterator;
import java.util.Collections; 


public class PPVisitor {

    private int indent_level = 0;
    private String indent = ""; // lmao 

    public void visit(Program program) {
        program.forEach(func->func.accept(this)); 
    }

    void visit(Function f) {
        f.declaration.accept(this);
        f.body.accept(this); 
    }

    void visit(FunctionDeclaration dec) {
        System.out.print(String.format("%s %s (", dec.type.toCodeString(), dec.id.toString())); 
        dec.params.accept(this);
        System.out.println(")"); 
    }

    void visit(FunctionBody body) {
        System.out.println("{");
        this.indent_level += 4;  
        body.variableList.forEach(vd->vd.accept(this));
        System.out.println();
        body.statementList.forEach(st->st.accept(this));
        this.indent_level -= 4;  
        System.out.println("}"); 
    }

    void visit(ParamList params) {
        Iterator<Param> paramIt = params.iterator(); 
        if (paramIt.hasNext()) {
            paramIt.next().accept(this);
            while (paramIt.hasNext()) {
                System.out.print(", "); 
                paramIt.next().accept(this); 
            }
        }
    }

    void visit(Param p) {
        System.out.print(p.toString()); 
    }

    void visit(BaseStatement st) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.print(indent + st.toCodeString()); 
    }

    void visit(VariableDeclaration dec) {
        System.out.print(dec.toCodeString(this.indent_level)); 
    }
}