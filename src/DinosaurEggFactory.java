public class DinosaurEggFactory extends EggFactory {

    @Override
    public Egg createEgg() {
        return new DinosaurEgg();
    }
}

