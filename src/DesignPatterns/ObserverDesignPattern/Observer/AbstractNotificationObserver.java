package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.StockObservable;

public abstract class AbstractNotificationObserver implements NotificationAlertObserver {

    protected String contactInfo;
    protected StockObservable stockObservable;

    public AbstractNotificationObserver(String contactInfo, StockObservable stockObservable) {
        this.contactInfo = contactInfo;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        String message = "Product is in stock, Hurry Up!! The quantity is now " + stockObservable.getStock();
        sendNotification(contactInfo, message);
    }

    protected abstract void sendNotification(String contactInfo, String message);
}
