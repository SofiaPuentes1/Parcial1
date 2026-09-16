package strategy;

public class EcoShipping implements ShippingStrategy {

    public double calculateCost(double weight, double distance) {
        return weight * 0.8 + distance * 0.15 + 5;
    }

    public String getDescription() {
        return "Eco shipping (carbon neutral)";
    }
}