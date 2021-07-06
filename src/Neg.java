public class Neg implements Operation{
    private final Operation Value1;


    public Neg(Operation valor1){
        this.Value1 = valor1;
    }


    @Override
    public Leaf eval() {
        return this.Value1.eval().NegacionL();
    }
}
