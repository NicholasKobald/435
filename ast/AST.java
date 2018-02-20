 /*  
  *
  *  This is enterprise coding! abstract classes!
  */

package ast;


public abstract class AST {

  protected int lineNumber = -1;
  protected int lineColumn = -1; 

  public int getLineNumber() {
      return this.lineNumber; 
  }

  public int getColumn() {
      return this.lineColumn;
  }
}