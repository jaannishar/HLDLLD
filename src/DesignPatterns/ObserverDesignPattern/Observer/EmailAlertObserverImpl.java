package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserverImpl extends AbstractNotificationObserver {

    public EmailAlertObserverImpl(String email, StockObservable stockObservable) {
        super(email, stockObservable);
    }

    @Override
    protected void sendNotification(String email, String message) {
        System.out.println("Sending email to : " + email +" \nThe email message is : " + message);
    }
}
