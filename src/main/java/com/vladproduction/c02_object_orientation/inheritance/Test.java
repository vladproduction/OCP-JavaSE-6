package com.vladproduction.c02_object_orientation.inheritance;

public class Test {
    public static void main(String[] args) {
        Test test1 = new Test();
        Test test2 = new Test();
        if(! test1.equals(test2)){
            System.out.println("test1 is not equals to test2");
        }
        if(test1 instanceof Object){
            System.out.println("test1 is an instance of the class Object");
        }

    }
}
