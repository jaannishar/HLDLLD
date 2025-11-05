package DesignPatterns.StrategyDesignPattern.PaymentStrategies;

import DesignPatterns.StrategyDesignPattern.PaymentStrategy;

public abstract class AbstractPaymentStrategy implements PaymentStrategy {

    protected String paymentDetails;

    public AbstractPaymentStrategy(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public void pay(double amount) {
        System.out.println(formatPaymentMessage(amount));
    }

    protected abstract String formatPaymentMessage(double amount);
}
