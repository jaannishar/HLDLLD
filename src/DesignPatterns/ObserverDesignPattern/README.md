# 📦 Observer Design Pattern - Java Implementation

This project demonstrates the **Observer Design Pattern** using a simple stock alert system for iPhones. It follows the classic **publisher-subscriber model**, where multiple observers subscribe to a stock notifier (observable) and get notified when the stock changes.

---

## 🎯 What is the Observer Pattern?

The **Observer Design Pattern** is a behavioral design pattern where an object (known as the *subject* or *observable*) maintains a list of dependents (called *observers*) and notifies them automatically of any state changes.

It’s useful when:
- You want to decouple components.
- You have multiple objects needing updates when one object changes.

---

## 💡 Real-world Analogy

When iPhone stock becomes available in a store:
- Email and SMS alerts are sent to users who subscribed to get notifications.
- If the stock changes, all subscribed users are notified automatically.

---

## 🧱 Project Structure

```text
DesignPatterns/
└── ObserverDesignPattern/
    ├── Observable/
    │   ├── StockObservable.java         // Interface
    │   └── IphoneObservableImpl.java    // Concrete implementation
    ├── Observer/
    │   ├── NotificationAlertObserver.java // Interface
    │   ├── EmailAlertObserverImpl.java    // Sends email alert
    │   └── PhoneAlertObserverImpl.java    // Sends phone/SMS alert
    └── Store.java                       // Main class to test implementation
```

## 📚 YouTube Tutorial
[Link](https://www.youtube.com/watch?v=Ep9_Zcgst3U&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=5)