package DesignPatterns.FactoryDesignPattern.Shapes;

import DesignPatterns.FactoryDesignPattern.Shape;

public class Rectangle implements Shape {

    double length, breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public double getArea() {
        return length * breath;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + breath);
    }
}
