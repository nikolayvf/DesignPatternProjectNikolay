import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

public class Basket {

    private List<Egg> eggs;
    private List<Observer> observers;

    public Basket() {
        eggs = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void addEgg(Egg egg) {
        eggs.add(egg);
        if (eggs.size() > 5) {
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}