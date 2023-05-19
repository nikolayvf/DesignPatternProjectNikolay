public class QuailEggFactory extends EggFactory{

    @Override
    public Egg createEgg() {
        return new QuailEgg();
    }
}
