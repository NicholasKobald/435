package ast;

public class IRLabel {
    
    int idNumber;

    public IRLabel(int id_number) {
        this.idNumber = id_number;
    }

    public String toString() {
        return String.format("L%s", Integer.toString(this.idNumber)); 
    }
}