package strategy;

public class PickupPointShipping implements ShippingStrategy {

    public double calculateCost(double weight, double distance) {
        double flatRate = 10;
        if (distance > 20) {
            flatRate = 15;
        }
        return flatRate;
    }

    public String getDescription() {
        return "Pickup point shipping";
    }
}