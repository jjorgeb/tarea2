public class Bool implements SumaString, IAndOr{
    private boolean Value;

    public Bool(boolean valor){
        this.Value = valor;
    }


    public String toString(){
        return String.valueOf(this.Value);
    }

    public boolean getValue(){
        return this.Value;
    }

    private String Neg(String s){
        String s2 = "";
        for(int i = 0; i<s.length() ;i++){
            if(s.charAt(i)=='1'){
                s2 += '0';
            }
            else{
                s2 += '1';
            }
        }
        return s2;
    }
    private String unos(String s){
        String s3 = "";
        for(int i=0; i<s.length(); i++){
            s3 += '1';
        }
        return s3;
    }

    private String ceros(String s){
        String s3 = "";
        for(int i=0; i<s.length(); i++){
            s3 += '0';
        }
        return s3;
    }

    public Str BoolToString(){
        return new Str(this.toString());
    }

    public Bool BoolToBool(){
        return new Bool(this.Value);
    }

    public Str SSumaString(Str x){
        return new Str(x.getValue()+this.toString());
    }
    public IAndOr And(IAndOr x){
        return x.AndBool(this);
    }
    public IAndOr Or(IAndOr x){
        return x.OrBool(this);
    }

    public Bool AndBool(Bool x){
        if (x.getValue()){
            return new Bool(this.Value);
        }
        else{
            return new Bool(false);
        }
    }
    public Bool OrBool(Bool x){
        if(x.getValue()){
            return new Bool(true);
        }
        else{
            return new Bool(this.Value);
        }
    }
    public Binary AndBinary(Binary x){
        if(this.Value){
            return new Binary(x.getValue());
        }
        else{
            return new Binary(ceros(x.getValue()));
        }
    }
    public Binary OrBinary(Binary x){
        if(this.Value){
            return new Binary(unos(x.getValue()));
        }
        else{
            return new Binary(x.getValue());
        }
    }
    public Bool Negacion(){
        if(this.Value){
            return new Bool(false);
        }
        else{
            return new Bool(true);
        }
    }



}
