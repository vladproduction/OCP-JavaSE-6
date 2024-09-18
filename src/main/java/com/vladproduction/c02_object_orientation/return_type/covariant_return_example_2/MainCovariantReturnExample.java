package com.vladproduction.c02_object_orientation.return_type.covariant_return_example_2;


/**
 * This example demonstrates how covariant return types allow for more specific objects to be returned
 * from overriding methods, improving code readability and reducing the need for casts.
 * */
public class MainCovariantReturnExample {
    public static void main(String[] args) {

        Shape square = new Square();
        Shape circle = new Circle();

        // We can call getArea() on both shapes and get the specific subtype
        Square actualSquare = (Square) square.getArea();
        Circle actualCircle = (Circle) circle.getArea();

        System.out.println("Square area object: " + actualSquare);
        System.out.println("Circle area object: " + actualCircle);

    }
}
