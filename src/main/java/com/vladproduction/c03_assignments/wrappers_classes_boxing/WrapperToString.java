package com.vladproduction.c03_assignments.wrappers_classes_boxing;

public class WrapperToString {
    public static void main(String[] args) {

        String d = Double.toString(3.14);
        System.out.println("d = " + d);

        /*
        * The radix tells the
          method to take the first argument, which is radix 10 (base 10) by default, and
          convert it to the radix provided
        * */

        String s = "hex = "+ Long.toString(254,16); // s = "hex = fe"
        System.out.println("s = " + s);



    }
}
