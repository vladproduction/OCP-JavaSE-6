package com.vladproduction.c03_assignments.assignments;

import java.awt.*;

public class ReferenceVariableAssign {
    public static void main(String[] args) {

        Button b = new Button();
        /**
         * The preceding line does three key things:
         * ■ Makes a reference variable named b, of type Button
         * ■ Creates a new Button object on the heap
         * ■ Assigns the newly created Button object to the reference variable b
         * */

        //you can also use a reference variable to refer
        //to any object that is a subclass of the declared reference variable type
        FirstClass asSecond = new SecondClass(); //legal: SecondClass is a subclass of FirstClass
//        SecondClass asFirst = new FirstClass(); //not-legal: FirstClass is not a subclass of SecondClass
        System.out.println("asSecond = " + asSecond);






    }
}

class FirstClass{
    public void doStuffFirstClass(){}
}

class SecondClass extends FirstClass{
    public void doStuffSecondClass(){}
}
