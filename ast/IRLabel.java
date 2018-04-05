package ast;


public class IRLabel extends Instruction {
    
    int idNumber;

    public IRLabel(int id_number) {
        this.idNumber = id_number;
    }

    public String toString() {
        return String.format("L%s:;", Integer.toString(this.idNumber)); 
    }
    
    public String refToString() {
        return String.format("L%s", Integer.toString(this.idNumber));
    }

    public String[] getJasminStrings() {
        return new String[] {
            String.format("L%d:", idNumber)
        };
    }
}
