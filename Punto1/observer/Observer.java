package observer;

public interface Observer {
	
    void receiveNotification(String eventType, String message);
    
}