package com.vladproduction.c03_assignments.assignments;

public class Assign_Primitive_to_Other_Primitive {
    public static void main(String[] args) {
        int a = 7;
        int b = a; //used the variable a only to copy its contents
        //but if we change
        //the contents of either a or b, the other variable won't be affected

        //example:
        int number1 = 11;
        System.out.println("number1 = " + number1);
        int number2 = number1;
        //trying to affect the number2:
        number2 = 12;
        System.out.println("number1 = " + number1 + " after affected the number2");
        //not referring to the same place in memory

    }
}
