package com.vladproduction.c03_assignments.variable_declaration;

public class LocalPrimitives {
    public static void main(String[] args) {

        //just init local (inside method) variable
        int year = 2024;
        System.out.println("year = " + year);

        //testing another problem:
        int x;
        if(args[0] != null){
            x = 7;
        }
//        int y = x; // have to initialize 'x' earlier
    }
}
