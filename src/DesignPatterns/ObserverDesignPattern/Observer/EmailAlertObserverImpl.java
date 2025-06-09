package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    public String email;
    public StockObservable stockObservable;

    public EmailAlertObserverImpl(String email, StockObservable stockObservable) {
        this.email = email;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMail(email, "Product is in stock, Hurry Up!! The quantity is now " + stockObservable.getStock());
    }

    private void sendMail(String email, String s) {
        System.out.println("Sending email to : " + email +" \nThe email message is : " + s);
    }
}
