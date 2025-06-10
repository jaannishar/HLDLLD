package DesignPatterns.FactoryDesignPattern;

import DesignPatterns.FactoryDesignPattern.Models.ShapeType;

public class Geometry {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE, 7);
        System.out.println("Area of circle: " + circle.getArea() + " And the circumference of circle: " + circle.getPerimeter());

        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE, 7, 2);
        System.out.println("Area of rectangle: " + rectangle.getArea() + " And perimeter of rectangle is : " + rectangle.getPerimeter());

        Shape square = shapeFactory.createShape(ShapeType.SQUARE, 7);
        System.out.println("Area of square: " + square.getArea() + " And the perimeter of square is : " + square.getPerimeter());
    }
}
