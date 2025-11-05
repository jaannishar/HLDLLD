package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.StockObservable;

public class PhoneAlertObserverImpl extends AbstractNotificationObserver {

    public PhoneAlertObserverImpl(String number, StockObservable stockObservable) {
        super(number, stockObservable);
    }

    @Override
    protected void sendNotification(String number, String message) {
        System.out.println("Message sent to number " + number + "\nThe message is: " + message);
    }
}
