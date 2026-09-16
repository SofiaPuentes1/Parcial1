package staff;

import observer.Observer;

public class HeadNurse implements Observer {

    private String name;

    public HeadNurse(String name) {
        this.name = name;
    }

    public void receiveNotification(String eventType, String message) {
        if (eventType.equals("Priority Change")) {
            System.out.println("Head Nurse " + name + " received a priority change " + message);
        }
    }
}