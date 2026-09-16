package strategy;

public interface ShippingStrategy {
	
    double calculateCost(double weight, double distance);
    String getDescription();
    
}