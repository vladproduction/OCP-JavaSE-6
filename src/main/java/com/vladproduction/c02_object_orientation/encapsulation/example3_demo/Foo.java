package com.vladproduction.c02_object_orientation.encapsulation.example3_demo;

/**
 * bad idea to skip encapsulation principle;
 * Look out for code that appears to be asking about the behavior of a
 * method, when the problem is actually a lack of encapsulation.
 *
 * Now consider this question: Is the value of right always going to be one-third the value of left?
 * It looks like it will, until you realize that users of the Foo class
 * don’t need to use the setLeft() method! They can simply go straight to the instance
 * variables and change them to any arbitrary int value.
 */
public class Foo {
    public int left = 9;
    public int right = 3;

    public void setLeft(int leftNum) {
        left = leftNum;
        right = leftNum / 3;
    }

    public static void main(String[] args) {
        Foo foo = new Foo();
        //code ... for test and see what is going on

        System.out.println("Initial Values:");
        System.out.println("left: " + foo.left);
        System.out.println("right: " + foo.right);

        // CompoundTest setLeft method
        foo.setLeft(12);

        System.out.println("\nAfter setLeft(12):");
        System.out.println("left: " + foo.left); //stands as we set through method
        System.out.println("right: " + foo.right); // made calculation through method
    }
}