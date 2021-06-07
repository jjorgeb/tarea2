public class Float implements INumber, SumaString {
    private double Value;

    public Float(double valor){
        this.Value = valor;
    }

    public String toString(){
        return String.valueOf(this.Value);
    }

    public double getValue(){
        return this.Value;
    }

    public Str FloatToString(){
        return new Str(this.toString());
    }

    public Float FloatToFloat(){
        return new Float(this.Value);
    }

    public Float suma(INumber x){
        return x.SumaFloat(this);
    }


    public Float SumaInt(Int x){
        return new Float(this.Value + x.getValue());
    }

    public Float SumaFloat(Float x){
        return new Float(x.getValue()+this.Value);
    }
    public Float resta(INumber x){
        return x.RestaFloat(this);
    }

    public Float RestaInt(Int x){
        return new Float(x.getValue() - this.Value);
    }
    public Float RestaFloat(Float x){
        return new Float(x.getValue()-this.Value);
    }
    public Float multiplicacion(INumber x){
        return x.MultiplicacionFloat(this);
    }
    public Float MultiplicacionInt(Int x){
        return new Float((x.getValue() * this.Value));
    }
    public Float MultiplicacionFloat(Float x){
        return new Float(x.getValue()*this.Value);
    }
    public Float division(INumber x){
        return x.DivisionFloat(this);
    }
    public Float DivisionInt(Int x){
        return new Float(x.getValue() / this.Value);
    }
    public Float DivisionFloat(Float x){
        return new Float(x.getValue()/this.Value);
    }
    public Str SSumaString(Str x){
        return new Str(x.getValue()+this.toString());
    }
}
