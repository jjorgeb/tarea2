public class Int implements INumber, INumberNoFloat, SumaString {
    private int Value;

    public Int(int valor){
        this.Value = valor;
    }


    public String toString(){
        return String.valueOf(this.Value);
    }

    private String toBin1(int x){
        String s = "";
        int v = x;
        while(v>0){
            s = String.valueOf(v%2) + s;
            v = v/2;
        }
        return s;
    }
    private String toBin2(int x){
        if(x>0){
            return '0' + toBin1(x);
        }
        else if(x==0){
            return "0000";
        }
        else{
            return '1' + Add1(Neg(toBin1(Math.abs(x))));
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
            if(s.charAt(i)=='1' & buf == 1){
                s1 = '0' + s1;
            }
            else if(s.charAt(i)=='0' & buf==1){
                s1 = '1' + s1;
                buf=0;
            }
            else if(s.charAt(i)=='1' & buf==0){
                s1 = '1' + s1;
            }
            else{
                s1 = s.charAt(i) + s1;
            }
        }
        return s1;
    }

    public int getValue(){
        return this.Value;
    }
    public Float IntToFloat(){
        return new Float(Value);
    }
    public Str IntToString(){
        return new Str(String.valueOf(this.Value));
    }
    public Int IntToInt(){
        return new Int(this.Value);
    }
    public Binary IntToBin(){
        return new Binary(toBin2(this.Value));
    }

    public INumber suma(INumber x){
        return x.SumaInt(this);
    }
    public Int SumaInt(Int x){
        return new Int(this.Value + x.getValue());
    }
    public Float SumaFloat(Float x){
        return new Float(x.getValue()+this.Value);
    }
    public Binary SumaBinary(Binary x){
        return new Binary(toBin2(x.getValueInt()+this.Value));
    }
    public INumber resta(INumber x){
        return x.RestaInt(this);
    }
    public Int RestaInt(Int x){
        return new Int(x.getValue() - this.Value);
    }
    public Float RestaFloat(Float x){
        return new Float(x.getValue()-this.Value);
    }
    public Binary RestaBinary(Binary x){
        return new Binary(toBin2(x.getValueInt()-this.Value));
    }
    public INumber multiplicacion(INumber x){
        return x.MultiplicacionInt(this);
    }
    public Int MultiplicacionInt(Int x){
        return new Int(x.getValue() * this.Value);
    }
    public Float MultiplicacionFloat(Float x){
        return new Float(x.getValue()*this.Value);
    }
    public Binary MultiplicacionBinary(Binary x){
        return new Binary(toBin2(x.getValueInt()*this.Value));
    }
    public INumber division(INumber x){
        return x.DivisionInt(this);
    }
    public Int DivisionInt(Int x){
        return new Int(x.getValue() / this.Value);
    }
    public Float DivisionFloat(Float x){
        return new Float(x.getValue()/this.Value);
    }
    public Binary DivisionBinary(Binary x){
        return new Binary(toBin2(x.getValueInt()/this.Value));
    }
    public Str SSumaString(Str x){
        return new Str(x.getValue()+this.toString());
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Int){
            var o = (Int) obj;
            return (o.getValue()==this.Value);
        }
        return false;
    }
}
