package strategy;

public class EconomicShipping implements ShippingStrategy {

    public double calculateCost(double weight, double distance) {
        return weight * 0.5 + distance * 0.05;
    }

    public String getDescription() {
        return "Economic shipping (maritime)";
        
    }
}