package DesignPatterns.StrategyDesignPattern.PaymentStrategies;

public class CreditCardPaymentStrategy extends AbstractPaymentStrategy {

    public CreditCardPaymentStrategy(String creditCardDetails) {
        super(creditCardDetails);
    }

    @Override
    protected String formatPaymentMessage(double amount) {
        return "Paying with credit card : " + paymentDetails + " with the amount : " + amount;
    }
}
