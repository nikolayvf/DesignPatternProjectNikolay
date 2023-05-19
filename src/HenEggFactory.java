public class HenEggFactory extends EggFactory{
    @Override
    public Egg createEgg() {
        return new HenEgg();
    }
}
