package ast;

import java.util.Iterator;
import java.util.Collections; 


public class PPVisitor {

    private static int indent_level = 0;

    public void visit(Program program) {
        program.forEach(func->func.accept(this)); 
    }

    void visit(Function f) {
        f.declaration.accept(this);
        f.body.accept(this);
        System.out.println(); 
    }

    void visit(FunctionDeclaration dec) {
        System.out.print(String.format("%s %s (", dec.type.toCodeString(), dec.id.toString())); 
        dec.params.accept(this);
        System.out.println(")"); 
    }

    void visit(FunctionBody body) {
        System.out.print("{");
        this.indent_level += 4;
        if (body.variableList.iterator().hasNext())
            System.out.println(); 
        body.variableList.forEach(vd->vd.accept(this));
        if (body.statementList.iterator().hasNext()) 
            System.out.println(); 
        body.statementList.forEach(st->st.accept(this));
        this.indent_level -= 4;
        // degenerative case 
        if (!body.variableList.iterator().hasNext() && !body.statementList.iterator().hasNext())
            System.out.println();   
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

    void visit(FunctionCall fc) {
        System.out.println(fc.toString()); 
    }

    void visit(Param p) {
        System.out.print(p.toString()); 
    }

    void visit(While w) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.println(indent + w.toCodeString());
        this.printBlock(w.statements);
    }

    void visit(BaseStatement st) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.print(indent + st.toCodeString()); 
    }

    void visit(VariableDeclaration dec) {
        System.out.print(dec.toCodeString(this.indent_level)); 
    }

    void visit(If if_block) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.println(indent + if_block.toCodeString());
        this.printBlock(if_block.statements);
        if (if_block.elseStatements != null) {
            System.out.println(indent + "else");
            this.printBlock(if_block.elseStatements);
        }
    }

    void visit(Return ret) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.println(indent + ret.toCodeString()); 
    }

    void visit(Print ps) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.println(indent + ps.toCodeString());
    }

    void visit(ArrayAssignment as) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.println(indent + as.toCodeString() + ";"); 
    }

    void visit(ArrayExpression ae) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.println(indent + ae.toCodeString() + ";"); 
    }

    void visit(ExpressionStatement et) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.println(indent + et.toCodeString() + ";");
    }


    void printBlock(StatementList statements) {
        String indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.println(indent + "{"); 
        this.indent_level += 4;
        statements.forEach(st->st.accept(this));
        this.indent_level -= 4;
        indent = String.join("", Collections.nCopies(indent_level, " ")); 
        System.out.println(indent + "}");
    }
}