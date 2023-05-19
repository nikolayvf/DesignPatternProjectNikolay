public class EggDecorator implements Egg{

    protected Egg decoratedEgg;

    public EggDecorator(Egg decoratedEgg) {
        this.decoratedEgg = decoratedEgg;
    }

    @Override
    public void decorate() {
    //todo
    }
}
