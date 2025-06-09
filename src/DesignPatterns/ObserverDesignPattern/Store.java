package DesignPatterns.ObserverDesignPattern;

import DesignPatterns.ObserverDesignPattern.Observable.IphoneObservableImpl;
import DesignPatterns.ObserverDesignPattern.Observable.StockObservable;
import DesignPatterns.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;
import DesignPatterns.ObserverDesignPattern.Observer.PhoneAlertObserverImpl;

public class Store {
    public static void main(String[] args) {
        StockObservable stockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("jaannisha7786@gmail.com", stockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("jaannish@amazon.com", stockObservable);
        NotificationAlertObserver observer3 = new PhoneAlertObserverImpl("7001234567", stockObservable);

        stockObservable.addObserver(observer1);
        stockObservable.addObserver(observer2);
        stockObservable.addObserver(observer3);
        //Should notify
        stockObservable.setStockCount(10);
        stockObservable.setStockCount(9);
        stockObservable.setStockCount(0);
        System.out.println("-----------------------------------------------------------------------------");
        stockObservable.setStockCount(1);
    }
}