package com.vladproduction.c03_assignments.assignments;

import java.awt.*;

public class Assign_One_Reference_to_Other {
    public static void main(String[] args) {

        Dimension a = new Dimension(5,10);
        System.out.println("a.height = " + a.height);
        Dimension b = a;
        b.height = 30;
        System.out.println("a.height = " + a.height +
                " after change to b");

        //String objects are given a special treatment:
        //For one thing, String objects are immutable;
        String x = "Java";  // Assign a value to x
        String y = x;       // Now y and x refer to the same String object
        System.out.println("y string = " + y); //Java

        x = x + " Bean"; // Now modify the object using the x reference
        System.out.println("y string = " + y); //still Java, not Java Bean




    }
}
