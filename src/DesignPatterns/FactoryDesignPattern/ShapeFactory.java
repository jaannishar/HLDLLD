package DesignPatterns.FactoryDesignPattern;

import DesignPatterns.FactoryDesignPattern.Models.ShapeType;
import DesignPatterns.FactoryDesignPattern.Shapes.Circle;
import DesignPatterns.FactoryDesignPattern.Shapes.Rectangle;
import DesignPatterns.FactoryDesignPattern.Shapes.Square;

public class ShapeFactory {

    public Shape createShape(ShapeType shapeType, double... dimensions) {
        return switch (shapeType) {
            case CIRCLE -> new Circle(dimensions[0]);
            case SQUARE -> new Square(dimensions[0]);
            case RECTANGLE -> new Rectangle(dimensions[0], dimensions[1]);
            default -> null;
        };
    }
}
