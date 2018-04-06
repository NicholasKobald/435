package types; 


public class ultype {

    public IntegerType _int;
    public BoolType _bool;
    public CharType _char;
    public StringType _string;
    public FloatType _float;
    public VoidType _void; 

    public ultype(FloatType ft, IntegerType int_type, BoolType bool_type, CharType ct, StringType st, VoidType vt) {
        this._float = ft;
        this._int = int_type;
        this._bool = bool_type;
        this._char = ct;
        this._string = st; 
        this._void = vt; 
    }
}