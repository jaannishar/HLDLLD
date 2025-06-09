package DesignPatterns.ObserverDesignPattern.Observable;

import DesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void addObserver(NotificationAlertObserver observer);
    public void removeObserver(NotificationAlertObserver observer);
    public void notifyObservers();
    public void setStockCount(int stock);
    public int getStock();
}
