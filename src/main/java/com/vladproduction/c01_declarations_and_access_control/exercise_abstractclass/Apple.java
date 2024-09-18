package com.vladproduction.c01_declarations_and_access_control.exercise_abstractclass;

import com.vladproduction.c01_declarations_and_access_control.exercise_abstractclass.food.Fruit;

class Apple extends Fruit { //default access

    @Override
    public void printInfo() {
        System.out.println("Apple");
    }

    @Override
    public String fruitShape(String appleShape) {
        return appleShape;
    }


}
