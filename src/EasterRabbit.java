public class EasterRabbit {

    private static EasterRabbit instance;

    private EasterRabbit() {
    }

    public static EasterRabbit getInstance() {
        if (instance == null) {
            instance = new EasterRabbit();
        }
        return instance;
    }
}
