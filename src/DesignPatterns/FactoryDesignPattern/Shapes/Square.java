package DesignPatterns.FactoryDesignPattern.Shapes;

import DesignPatterns.FactoryDesignPattern.Shape;

public class Square implements Shape {

    double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return edge * edge;
    }

    @Override
    public double getPerimeter() {
        return 4 * edge;
    }
}
