package Observer;

import java.util.ArrayList;
import java.util.List;

public class SmartDevice implements Subject {
    private String name;
    private String status;
    private List<Observer> observers;

    public SmartDevice(String name) {
        this.name = name;
        this.status = "off";
        this.observers = new ArrayList<>();
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getStatus() {
        return status;
    }

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
            observer.update(name, status);
        }
    }
}