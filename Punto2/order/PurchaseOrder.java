package order;

import strategy.ShippingStrategy;

public class PurchaseOrder {

    private String customerName;
    private double packageWeight;
    private double distanceToDestination;
    private ShippingStrategy shippingStrategy;

    public PurchaseOrder(String customerName, double packageWeight, double distanceToDestination) {
        this.customerName = customerName;
        this.packageWeight = packageWeight;
        this.distanceToDestination = distanceToDestination;
        
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
        
    }

    public double calculateShippingCost() {
        return shippingStrategy.calculateCost(packageWeight, distanceToDestination);
        
    }

    public void printOrderSummary() {
        System.out.println("Customer: " + customerName);
        System.out.println("Shipping method: " + shippingStrategy.getDescription());
        System.out.println("Shipping cost: " + calculateShippingCost());
        
    }
    
}