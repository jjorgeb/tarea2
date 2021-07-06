public class And implements Operation{
    private final Operation Value1;
    private final Operation Value2;


    public And(Operation valor1, Operation valor2){
        this.Value1 = valor1;
        this.Value2 = valor2;
    }


    @Override
    public Leaf eval() {
        return this.Value1.eval().AndL(this.Value2.eval());
    }
}
