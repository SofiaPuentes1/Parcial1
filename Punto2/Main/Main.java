package Main;

import order.PurchaseOrder;
import strategy.EconomicShipping;
import strategy.ExpressShipping;
import strategy.EcoShipping;
import strategy.PickupPointShipping;

public class Main {
    public static void main(String[] args) {
        PurchaseOrder order = new PurchaseOrder("Person", 5.0, 30.0);

        order.setShippingStrategy(new EconomicShipping());
        order.printOrderSummary();

        order.setShippingStrategy(new ExpressShipping());
        order.printOrderSummary();

        order.setShippingStrategy(new EcoShipping());
        order.printOrderSummary();

        order.setShippingStrategy(new PickupPointShipping());
        order.printOrderSummary();
    }
}