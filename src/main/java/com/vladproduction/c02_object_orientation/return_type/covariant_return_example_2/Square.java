package com.vladproduction.c02_object_orientation.return_type.covariant_return_example_2;

public class Square implements Shape{

    private String name = "Square";

    @Override
    public Square getArea() {
        // This method also returns a more specific type - Square
        return this;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                '}';
    }
}
