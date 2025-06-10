package DesignPatterns.StrategyDesignPattern.PaymentStrategies;

import DesignPatterns.StrategyDesignPattern.PaymentStrategy;

public class UPIPaymentStrategy implements PaymentStrategy {

    String UpiId;

    public UPIPaymentStrategy(String UpiId) {
        this.UpiId = UpiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment with UPI Id: " + UpiId + " Amount : " + amount);
    }
}
