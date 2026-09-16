package central;

import observer.Observer;
import observer.Subject;
import java.util.ArrayList;

public class MonitoringCenter implements Subject {

    private ArrayList<Observer> observers;

    public MonitoringCenter() {
        observers = new ArrayList<Observer>();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String eventType, String message) {
        for (int i = 0; i < observers.size(); i++) {
            Observer currentObserver = observers.get(i);
            currentObserver.receiveNotification(eventType, message);
        }
    }

    public void reportVitalSignsAlert(String message) {
        notifyObservers("Vital Signs", message);
    }

    public void reportPriorityChange(String message) {
        notifyObservers("Priority Change", message);
    }

    public void reportLabRequest(String message) {
        notifyObservers("Lab Request", message);
    }
}
