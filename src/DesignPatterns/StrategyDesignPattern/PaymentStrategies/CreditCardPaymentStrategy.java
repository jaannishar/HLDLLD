package DesignPatterns.StrategyDesignPattern.PaymentStrategies;

import DesignPatterns.StrategyDesignPattern.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    String creditCardDetails;

    public CreditCardPaymentStrategy(String creditCardDetails) {
        this.creditCardDetails = creditCardDetails;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying with credit card : " + creditCardDetails + " with the amount : " + amount);
    }
}
