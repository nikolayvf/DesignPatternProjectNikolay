public class Main {
    public static void main(String[] args) {
        //TODO
        Basket basket = new Basket();

        LittleChicken chickenOne = new LittleChicken();
        LittleChicken chickenTwo = new LittleChicken();
        LittleChicken chickenThree = new LittleChicken();

        basket.addObserver(chickenOne);
        basket.addObserver(chickenTwo);
        basket.addObserver(chickenThree);

        EasterRabbit easterRabbit = EasterRabbit.getInstance();
        EggFactory quailEggFactory = new QuailEggFactory();
        EggFactory henEggFactory = new HenEggFactory();
        EggFactory dinosaurEggFactory = new DinosaurEggFactory();

        for (int i = 0; i < 7; i++) {
            Egg egg = null;
            int eggType = (int) (Math.random() * 3);
            switch (eggType) {
                case 0:
                    egg = quailEggFactory.createEgg();
                    break;
                case 1:
                    egg = henEggFactory.createEgg();
                    break;
                case 2:
                    egg = dinosaurEggFactory.createEgg();
                    break;
            }

            int decorationType = (int) (Math.random() * 2);
            if (decorationType == 0) {
                egg = new WrapDecorator(egg);
            } else {
                egg = new ColorDecorator(egg);
            }

            egg.decorate();
            basket.addEgg(egg);
        }
    }
}
