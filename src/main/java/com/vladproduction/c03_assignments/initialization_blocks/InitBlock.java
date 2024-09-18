package com.vladproduction.c03_assignments.initialization_blocks;

public class InitBlock {
    public static void main(String[] args) {

        /**
         * 1) static initialization block runs once;
         * 2) instance initialization block runs once every time a new instance is created;
         * 3) order of execution:
         *  - instance init block code runs right after the call to super() in a constructor
         *  (if a class has more than one, they will run in the order in which they appear in the class file);
         * */

        new InitBlock();
        /*
        * 1st static init block   //print directly after init new instance of the class
        * 2nd static init block
        * 1st instance init
        * 2nd instance init
        * no arg constructor
        * */
        System.out.println("--------args--------");
        new InitBlock(7);
        /*
        * 1st static init block
          2nd static init block
          1st instance init     //will print only in case it has been invoked for the first time
          2nd instance init     //will print only in case it has been invoked for the first time
          arg-1 constructor
        * */

    }

    InitBlock(int x){
        System.out.println("arg-1 constructor");
    }
    InitBlock(){
        System.out.println("no arg constructor");
    }
    static {
        System.out.println("1st static init block");
    }
    { System.out.println("1st instance init"); }
    { System.out.println("2nd instance init"); }
    static {
        System.out.println("2nd static init block");
    }
}
