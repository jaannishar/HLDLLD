package DesignPatterns.StrategyDesignPattern.PaymentStrategies;

public class UPIPaymentStrategy extends AbstractPaymentStrategy {

    public UPIPaymentStrategy(String upiId) {
        super(upiId);
    }

    @Override
    protected String formatPaymentMessage(double amount) {
        return "Payment with UPI Id: " + paymentDetails + " Amount : " + amount;
    }
}
