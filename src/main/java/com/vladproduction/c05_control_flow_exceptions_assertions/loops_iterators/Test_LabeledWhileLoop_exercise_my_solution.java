package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class Test_LabeledWhileLoop_exercise_my_solution {
    public static void main(String[] args) {
        /*  Try creating a labeled while loop. Make the label outer and provide a condition to
            check whether a variable age is less than or equal to 21. Within the loop, increment
            age by one. Every time the program goes through the loop, check whether age is 16.
            If it is, print the message "get your driver's license" and continue to the outer loop. If
            not, print "Another year."
               -The outer label should appear just before the while loop begins.
               -Make sure age is declared outside of the while loop.*/

        int age = 0;
        outer:
        while (age <= 21){
            age++;
            if (age == 16){
                System.out.println(age + " :age; get your driver's license");
                continue outer;
            } else {
                System.out.println(age + " :age; Another year.");
            }
        }
    }
}
