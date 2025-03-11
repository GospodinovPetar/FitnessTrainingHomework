import java.util.ArrayList;
import java.util.List;

public class Trainee implements Subject {
    private String position;
    private List<Observer> observers = new ArrayList<>();

    public void changePosition(String position) {
        this.position = position;
        System.out.println("Trainee: Промяна на позиция към " + position);
        notifyObservers(position);
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String position) {
        for (Observer observer : observers) {
            observer.update(position);
        }
    }
}
