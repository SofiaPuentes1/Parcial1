package strategy;

public class ExpressShipping implements ShippingStrategy {

    public double calculateCost(double weight, double distance) {
        return weight * 2.0 + distance * 0.3 + 20;
    }

    public String getDescription() {
        return "Express shipping (air)";
    }
}