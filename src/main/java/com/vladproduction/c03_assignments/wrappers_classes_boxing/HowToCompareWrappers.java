package com.vladproduction.c03_assignments.wrappers_classes_boxing;

public class HowToCompareWrappers {
    public static void main(String[] args) {

        //example 1
        Integer x1 = 1000;
        Integer x2 = 1000;
        if(x1 != x2){
            System.out.println("x1 not equal x2");
        }
        if(x1.equals(x2)){
            System.out.println("meaningfully equal");
        }

        //example 2
        Integer i3 = 10;
        Integer i4 = 10;
        if(i3 == i4) System.out.println("same object");
        if(i3.equals(i4)) System.out.println("meaningfully equal");

        /**
         * When == is used to compare a primitive to a wrapper, the wrapper will be
         * unwrapped and the comparison will be primitive to primitive
         * */
    }
}
