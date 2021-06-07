public class Int implements Type {
    private int Value;

    public Int(int valor){
        this.Value = valor;
    }


    private String toString(int i){
        return String.valueOf(i);
    }

    private String toBin1(){
        String s = "";
        int v = this.Value;
        while(v>0){
            s += toString(v%2);
            v = v/2;
        }
        return s;
    }
    private String toBin2(){
        if(this.Value>0){
            return '1' + toBin1();
        }
        else if(this.Value==0){
            return "0000";
        }
        else{
            return '1' + Add1(Neg(toBin1()));
        }
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
    private String Add1(String s){
        String s1 = "";
        int buf = 1;
        for(int i = s.length()-1; i>=0 ;i--){
            if(s.charAt(i)==1 & buf == 1){
                s1 = '0' + s1;
            }
            else if(s.charAt(i)==0 & buf==1){
                s1 = '1' + s1;
                buf--;
            }
            else{
                s1 = s.charAt(i) + s1;
            }
        }
        return s1;
    }

    public String getValue(){
        return toString(this.Value);
    }
    public Float IntToFloat(){
        return new Float(Value);
    }
    public Str IntToString(){
        return new Str(toString(this.Value));
    }
    public Int IntToInt(){
        return new Int(this.Value);
    }
    public Binary IntToBin(){
        return new Binary(toBin2());
    }


}
