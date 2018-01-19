/*
 Base AST class blabalba enterprise factory generator inheirtence 
*/

package ast;


public abstract class AST {

    void accept(PPVisitor v) {
        v.visit(this);
    }
        
}