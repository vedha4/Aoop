package auction;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String item;
    public void setItem(String item) {
        this.item = item;
        notifyObservers("New item available: " + item);
    }

    public void startBidding() {
        notifyObservers("Bidding has started for: " + item);
    }

    public void endBidding() {
        notifyObservers("Bidding has ended for: " + item);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}