package DesignPatterns.StrategyDesignPattern.PaymentStrategies;

public class DebitCardPaymentStrategy extends AbstractPaymentStrategy {

    public DebitCardPaymentStrategy(String debitCardDetails) {
        super(debitCardDetails);
    }

    @Override
    protected String formatPaymentMessage(double amount) {
        return "Paying amount : " + amount +" from debit card : " + paymentDetails;
    }
}
