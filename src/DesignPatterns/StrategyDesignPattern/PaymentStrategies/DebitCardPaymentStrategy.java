package DesignPatterns.StrategyDesignPattern.PaymentStrategies;

import DesignPatterns.StrategyDesignPattern.PaymentStrategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {

    String DebitCardDetails;

    public DebitCardPaymentStrategy(String DebitCardDetails) {
        this.DebitCardDetails = DebitCardDetails;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying amount : " + amount +" from debit card : " + DebitCardDetails);
    }
}
