public class Float implements Type {
    private double Value;

    public Float(double valor){
        this.Value = valor;
    }

    private String toString(double d){
        return String.valueOf(d);
    }

    public String getValue(){
        return toString(this.Value);
    }

    public Str FloatToString(){
        return new Str(toString(this.Value));
    }

    public Float FloatToFloat(){
        return new Float(this.Value);
    }
}
