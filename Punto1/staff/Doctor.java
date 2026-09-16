package staff;

import observer.Observer;

public class Doctor implements Observer {

    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void receiveNotification(String eventType, String message) {
        if (eventType.equals("Vital Signs")) {
            System.out.println("Doctor " + name + " received a critical vital signs alert " + message);
        }
    }
}