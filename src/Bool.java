public class Bool implements Type{
    private boolean Value;

    public Bool(boolean valor){
        this.Value = valor;
    }


    private String toString(boolean i){
        return String.valueOf(i);
    }

    public String getValue(){
        return toString(this.Value);
    }

    public Str BoolToString(){
        return new Str(toString(this.Value));
    }

    public Bool BoolToBool(){
        return new Bool(this.Value);
    }


}
