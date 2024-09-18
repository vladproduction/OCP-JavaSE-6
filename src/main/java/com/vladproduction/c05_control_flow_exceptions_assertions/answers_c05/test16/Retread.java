package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test16;

public class Retread extends Tire{
    public static void main(String[] args) {

        new Retread().doStuff();

        //C D
        /*C and D are correct. An overriding method cannot throw checked exceptions that are
        broader than those thrown by the overridden method. However, an overriding method can
        throw RuntimeExceptions not thrown by the overridden method.*/

    }

    //code here:

    //1)
//     void doStuff() {System.out.println(7/0);}

    //2) compile error
//     void doStuff() throws MyException {System.out.println(7/0);}

    //3)
//     void doStuff() throws RuntimeException {System.out.println(7/0);}

    //4)
//     void doStuff() throws ArithmeticException {System.out.println(7/0);}

}
        /*
        When fragments I - IV are added, independently, at line 10, which are true? (Choose all that apply.)
        A. None will compile -
        B. They will all compile -
        C. Some, but not all, will compile +
        D. All of those that compile will throw an exception at runtime +
        E. None of those that compile will throw an exception at runtime -
        F. Only some of those that compile will throw an exception at runtime -
        */
