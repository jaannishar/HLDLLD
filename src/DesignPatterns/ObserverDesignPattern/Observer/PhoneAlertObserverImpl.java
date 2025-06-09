package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.StockObservable;

public class PhoneAlertObserverImpl implements NotificationAlertObserver {

    public String number;
    public StockObservable stockObservable;

    public PhoneAlertObserverImpl(String number, StockObservable stockObservable) {
        this.number = number;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessage(number, "Product is in stock, Hurry Up!! The quantity is now " + stockObservable.getStock());
    }

    private void sendMessage(String number, String s) {
        System.out.println("Message sent to number " + number + "\nThe message is: " + s);
    }
}
