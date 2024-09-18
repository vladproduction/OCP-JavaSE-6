package com.vladproduction.c08_inner_classes.answers_c08.test11;

public class Navel {
    private int size = 7; //Instance Variable declared
    private static int length = 3; //Static Variable declared

    public static void main(String[] args) {
        new Navel().go();//creates an instance of Navel and invokes the go() method on that instance
    }
    void go(){
        int size = 5; //is a local variable size declared; can use only method go() scope;
        System.out.println(new Gazer().adder()); //creates an instance of the inner class Gazer and calls the adder() method;
    }
    class Gazer{
        int adder(){ //for inner class - variables from outer is visible
            return size * length; //21
            /*Note: The size used here refers to the instance variable of the outer class Navel
            because the instance variable is not shadowed inside the inner class.
            The shadowing applies only within its own enclosing method*/
        }
    }
}

/*What is the result?
A. 15
+B. 21
C. An exception is thrown at runtime
D. Compilation fails due to multiple errors
E. Compilation fails due only to an error on line 4
F. Compilation fails due only to an error on line 5*/

/*Answer:
        ✓ B is correct. The inner class Gazer has access to Navel's private static and private
instance variables.
         A, C, D, E, and F are incorrect based on the above. (Objectives 1.1, 1.4)*/
