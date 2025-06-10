package DesignPatterns.FactoryDesignPattern.Shapes;

import DesignPatterns.FactoryDesignPattern.Shape;

public class Circle implements Shape {
    double radius;
    final double pi = 3.14;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }
}
