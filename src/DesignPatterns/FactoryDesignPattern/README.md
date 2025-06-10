# 📦 Factory Design Pattern - Java Implementation

This project demonstrates the **Factory Design Pattern** by creating different geometric shapes such as Circle, Square, and Rectangle. It encapsulates the creation logic inside a factory class, allowing clients to request shape objects without worrying about their instantiation details.

---

## 🎯 What is the Factory Pattern?

The **Factory Design Pattern** is a creational design pattern that provides an interface for creating objects but lets subclasses decide which class to instantiate. It helps to abstract the instantiation process and promotes loose coupling.

It’s useful when:
- You want to encapsulate object creation.
- You want to decouple client code from concrete implementations.
- You need to manage and extend object creation easily.

---

## 💡 Real-world Analogy

Think of a **Shape Factory** like a shape-making shop:
- You request a shape by specifying the type (circle, square, rectangle).
- You provide the necessary dimensions (radius, side length, etc.).
- The factory creates and hands you the shape, so you don’t need to know the details of how it was made.

---

## 🧱 Project Structure

```text
DesignPatterns/
└── FactoryDesignPattern/
    ├── Models/
    │   └── ShapeType.java             // Enum defining shape types (CIRCLE, SQUARE, RECTANGLE)
    ├── Shapes/
    │   ├── Circle.java                // Circle implementation
    │   ├── Square.java                // Square implementation
    │   └── Rectangle.java             // Rectangle implementation
    ├── Shape.java                    // Shape interface with area() and perimeter()
    └── ShapeFactory.java             // Factory class to create shapes based on ShapeType
