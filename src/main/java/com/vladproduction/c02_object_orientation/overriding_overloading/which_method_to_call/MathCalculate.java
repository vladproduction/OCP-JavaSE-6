package com.vladproduction.c02_object_orientation.overriding_overloading.which_method_to_call;

public class MathCalculate {

    public void addNumbs(int x, int y){
        System.out.println(x + y);
    }

    public void addNumbs(double x, double y){
        System.out.println(x + y);
    }

}
