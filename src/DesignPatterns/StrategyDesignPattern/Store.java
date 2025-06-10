package DesignPatterns.StrategyDesignPattern;

import DesignPatterns.StrategyDesignPattern.PaymentStrategies.CreditCardPaymentStrategy;
import DesignPatterns.StrategyDesignPattern.PaymentStrategies.UPIPaymentStrategy;

public class Store {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new UPIPaymentStrategy("70043@ybl"));

        cart.addItem(12.50);
        cart.addItem(2.00);
        cart.addItem(8.00);
        cart.checkOut();

        //Change payment strategy at runtime.
        cart.setPaymentStrategy(new CreditCardPaymentStrategy("1234-5678-1234-5678"));
        cart.addItem(9.25);
        cart.checkOut();
    }
}
