package com.vladproduction.c01_declarations_and_access_control.exercise_abstractclass.food;

public abstract class Fruit {

    public abstract void printInfo();

    //could have the method that is not abstract
    public String fruitShape(String s){
        s = "default fruit shape";
        return  s;
    }

}
