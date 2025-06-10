package DesignPatterns.StrategyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;
    List<Double> itemAmount;

    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        this.itemAmount = new ArrayList<Double>();
    }

    public void addItem(double amount) {
        itemAmount.add(amount);
    }

    public double getTotal() {
        return itemAmount.stream().mapToDouble(Double::doubleValue).sum();
    }

    public void checkOut() {
        double total = getTotal();
        paymentStrategy.pay(total);
    }

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
