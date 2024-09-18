package com.vladproduction.c02_object_orientation.encapsulation.example2_shape;

public class MainShapeApp {
    public static void main(String[] args) {

        Shape square = new Square(5);
        Shape circle = new Circle(5);
        System.out.println("square.area() = " + square.getArea());
        System.out.println("circle.area() = " + circle.getArea());

    }
}
