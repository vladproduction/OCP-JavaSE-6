package com.vladproduction.c03_assignments.variable_declaration;

public class PrimitiveInstanceVariableDeclaration {
    public static void main(String[] args) {

        BirthYear by = new BirthYear();
        by.showYear();

    }
}
class BirthYear{
    int year;
    int year2 = 2024;
    public void showYear(){
        System.out.println("Birth Year is (0 by default): " + year);
        System.out.println("Birth Year is (set value): " + year2);
    }
}
