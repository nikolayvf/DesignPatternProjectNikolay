public class ColorDecorator extends EggDecorator {
    public ColorDecorator(Egg decoratedEgg) {
        super(decoratedEgg);
    }
    @Override
    public void decorate() {
        decoratedEgg.decorate();
        System.out.println("Боядисване на яйцeтo с боя от естествени материали");
    }
}


