public class Str implements SumaString {
    private String Value;

    public Str(String string){
        this.Value = string;
    }

    private String toString(String s){
        return s;
    }

    public String getValue(){
        return this.Value;
    }

    public Str StringToString(){
        return new Str(this.Value);
    }

    public Str suma(SumaString x){
        return x.SSumaString(this);
    }

    public Str SSumaString(Str x){
        return new Str(x.getValue()+this.Value);
    }
}
