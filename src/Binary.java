public class Binary implements INumber, INumberNoFloat{
    private String Value;

    public Binary(String valor){
        this.Value = valor;
    }


    public String getValue(){
        return this.Value;
    }
    public int getValueInt(){
        return toInt(this.Value);
    }

    private int toInt(String binary) {
        if(bitToInt(binary.charAt(0))==0) {
            return positiveBinToInt(binary);
        }
        else{
            return negativeBinaryToInt(binary);
        }
    }
    private int negativeBinaryToInt(String binary) {
        int n=binary.length()-1;
        int w=-bitToInt(binary.charAt(0))*(int) Math.pow(2, n);
        for(int i=n, j=0; i>0; i--, j++) {
            w+=(int) Math.pow(2, j)*(binary.charAt(i)=='1'?1:0);
        }
        return w;
    }
    private int positiveBinToInt(String binary) {
        int w=0;
        for(int i=binary.length()-1, j=0; i>0; i--, j++) {
            w += (int) Math.pow(2, j)*bitToInt(binary.charAt(i));
        }
        return w;
    }
    private int bitToInt(char bit) {
        return bit == '0' ? 0 : 1;
    }

    public Int BinaryToInt(){
        return new Int(toInt(this.Value));
    }

    public Float BinaryToFloat(){
        return new Float(toInt(this.Value));
    }

    public Str BinaryToString(){
        return new Str(this.Value);
    }

    public Binary BinaryToBinary(){
        return new Binary(this.Value);
    }

    //@Override
    public Binary suma(Int x){
        return x.SumaBinary(this);
    }

    public Binary suma(INumberNoFloat x){
        return x.SumaBinary(this);
    }
    public Binary suma(Binary x){
        return x.SumaBinary(this);
    }
    //falta cambiar la funcion
    public Binary SumaBinary(Binary x){
        return this;
    }
    public Int SumaInt(Int x){
        return new Int(toInt(this.Value)+x.getValue());
    }
    public Float SumaFloat(Float x){
        return new Float(toInt(this.Value)+x.getValue());
    }
    public Binary RestaBinary(Binary x){
        return this;
    }
    public Int RestaInt(Int x){
        return new Int(x.getValue()-toInt(this.Value));
    }
    public Float RestaFloat(Float x){
        return new Float(x.getValue()-toInt(this.Value));
    }
    public Binary MultiplicacionBinary(Binary x){
        return this;
    }
    public Int MultiplicacionInt(Int x){
        return new Int(x.getValue()*toInt(this.Value));
    }
    public Float MultiplicacionFloat(Float x){
        return new Float(x.getValue()*toInt(this.Value));
    }
    public Binary DivisionBinary(Binary x){
        return this;
    }
    public Int DivisionInt(Int x){
        return new Int(x.getValue()/toInt(this.Value));
    }
    public Float DivisionFloat(Float x){
        return new Float(x.getValue()/toInt(this.Value));
    }
}
