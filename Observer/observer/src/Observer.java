import java.util.ArrayList;
import java.util.List;

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

interface Observer {
    void update(String message);
}

class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String message;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

class NewsChannel implements Observer {
    private String message;

    @Override
    public void update(String message) {
        this.message = message;
        display();
    }

    public void display() {
        System.out.println("News Channel: " + message);
    }
}
