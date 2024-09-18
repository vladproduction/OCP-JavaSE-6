package com.vladproduction.c01_declarations_and_access_control.exercise_interface;

public class Circle implements Drawable{
    @Override
    public void draw() {
        System.out.println("Circle is drawing now.");
    }
}
