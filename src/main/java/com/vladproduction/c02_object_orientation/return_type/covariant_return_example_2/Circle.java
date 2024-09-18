package com.vladproduction.c02_object_orientation.return_type.covariant_return_example_2;

public class Circle implements Shape{

    private String name = "Circle";

    @Override
    public Circle getArea() {
        // This method also returns a more specific type - Circle
        return this;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                '}';
    }
}
