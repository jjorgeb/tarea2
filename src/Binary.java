public class Binary implements Type{
    private String Value;

    public Binary(String valor){
        this.Value = valor;
    }


    public String getValue(){
        return this.Value;
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








}
