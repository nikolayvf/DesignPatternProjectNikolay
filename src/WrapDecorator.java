public class WrapDecorator extends EggDecorator{
    public WrapDecorator(Egg decoratedEgg) {
        super(decoratedEgg);
    }

    @Override
    public void decorate() {
        decoratedEgg.decorate();
        System.out.println("Облепяне с рециклирани стикери");
    }
}
