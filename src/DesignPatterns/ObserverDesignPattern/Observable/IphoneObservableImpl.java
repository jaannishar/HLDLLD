package DesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    private int currentStock;
    private final List<NotificationAlertObserver> observers;

    public IphoneObservableImpl() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stock) {
        boolean wasOutOfStock = currentStock == 0;
        currentStock = stock;
        if (stock != 0 && wasOutOfStock) {
            notifyObservers();
        }
    }

    @Override
    public int getStock() {
        return currentStock;
    }
}
