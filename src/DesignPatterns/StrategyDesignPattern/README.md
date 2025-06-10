# 💳 Strategy Design Pattern - Java Implementation

This project demonstrates the **Strategy Design Pattern** using a simple payment processing system. The pattern enables dynamic selection of different payment methods like **Credit Card**, **Debit Card**, and **UPI**, making the system flexible and easily extendable.

---

## 🎯 What is the Strategy Pattern?

The **Strategy Design Pattern** is a behavioral design pattern that lets you define a family of algorithms, encapsulate each one, and make them interchangeable at runtime.

It’s useful when:
- You want to avoid multiple conditional statements (`if/else` or `switch`).
- You want to choose an algorithm or behavior at runtime.
- You want to follow the Open/Closed Principle — open for extension, closed for modification.

---

## 💡 Real-world Analogy

Consider a shopping cart that supports different payment methods:
- The customer may choose to pay via Credit Card, Debit Card, or UPI.
- The system delegates the payment responsibility to the selected payment strategy.
- Each payment method is independent and interchangeable.

---

## 🧱 Project Structure

```text
DesignPatterns/
└── StrategyDesignPattern/
    ├── PaymentStrategy.java            // Strategy interface
    ├── PaymentStrategies
        ├── CreditCardPaymentStrategy.java      // Concrete strategy: Credit Card
        ├── DebitCardPaymentStrategy.java       // Concrete strategy: Debit Card
        ├── UPIPaymentStrategy.java             // Concrete strategy: UPI
    ├── ShoppingCart.java               // Context class using a strategy
    └── Store.java                      // Test class to demonstrate usage
