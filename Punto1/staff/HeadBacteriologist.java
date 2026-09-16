package staff;

import observer.Observer;

public class HeadBacteriologist implements Observer {

    private String name;

    public HeadBacteriologist(String name) {
        this.name = name;
    }

    public void receiveNotification(String eventType, String message) {
        if (eventType.equals("Lab Request")) {
            System.out.println("Head Bacteriologist " + name + " received a lab request " + message);
        }
    }
}