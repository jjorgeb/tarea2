public class Str implements Type {
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
}
