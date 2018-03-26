package jvmgen;

import types.*; 
import ast.*;

public class ULJVMGenerator {

    IRProgram irP; 
    StringBuilder sb; 
    String source;
    String cn; 
    ultype ultype;
    int indent_level;  

    public ULJVMGenerator(IRProgram p, String source, String classname, ultype ultypes) {
        sb = new StringBuilder(); 
        this.irP = p; 
        this.cn = classname;
        this.source = source; 
        this.ultype = ultypes;
    }

    public void generate() {
        this.generatePrefixBoilerplate();
        for (IRFunction f: this.irP.functionList) {
            this.generate(f); 
        }
    }

    public void generate(IRFunction f) {
        appendline(String.format(".method public static %s(%s)%s",
            f.functionName, paramTypeString(f), convertTypeToJVMString(f.t)));
        
        this.indent_level += 4;      
        appendline(String.format(".limit locals %s", Integer.toString(f.numTemps())));
        appendline(".limit stack 250"); //  ¯\_(ツ)_/¯ works on my machine
        for (Temp t: f.tempList) {
            this.generateVariableDeclaration(t); 
        }

        this.indent_level -= 4; 
        appendline(".end method");
    }

    private void generateVariableDeclaration(Temp t) {
        if (t.type == ultype._int || t.type == ultype._char) {
            appendline("ldc 0");
            appendline(String.format("istore %d", t.tempId));
        } else {
            System.out.println("Could you have forgotten to support a particular type being declared?");
        }
    }

    private void generatePrefixBoilerplate() {
        appendline(String.format(".class public %s", this.cn));
        appendline(".super java/lang/Object");
        newline(); 
        appendline(".method public <init>()V");
        appendline("aload_0", 4);
        appendline("invokespecial java/lang/Object/<init>()V", 4); 
        appendline("return", 4); 
        appendline(".end method"); 
        newline(); 
        //appendline(".method public static main([Ljava/lang/String;)V");
    }


    private void newline() {
        sb.append("\n");
    }

    private void appendline(String s) {
        sb.append(get_indent() + s + "\n");
    }

    private void appendline(String s, int indent) {
        sb.append(get_indent(indent) + s + "\n"); 
    }

    public String toString() {
        return sb.toString();
    }



    protected String convertTypeToJVMString(Type t) {
        if (t instanceof BoolType) {
            return "Z"; 
        }
        if (t instanceof CharType) {
            return "C"; 
        }
        if (t instanceof IntegerType) {
            return "I"; 
        }
        if (t instanceof FloatType) {
            return "F"; 
        }
        if (t instanceof VoidType) {
            return "V"; 
        }
        if (t instanceof StringType) {
            return "U"; // -> probably needs to be java.lang.String or something
        }
        if (t instanceof ArrayType) { 
            return "A" + this.convertTypeToJVMString(((ArrayType)t).type); 
        }
        return "INVALID_TYPE"; 
    }

    public String paramTypeString(IRFunction f) {
        String s = "";
        for (Param p: f.pl) {
            s += this.convertTypeToJVMString(p.type); 
        }
        return s; 
    }

    private String get_indent() {
        int indent_depth = indent_level; 
        String ind = "";
        for (int i = 0; i < indent_depth; i++) {
            ind += " "; 
        }
        return ind; 
    }

    private static String get_indent(int indent_depth) {
        String ind = "";
        for (int i = 0; i < indent_depth; i++) {
            ind += " "; 
        }
        return ind; 
    }
}