package com.vladproduction.c07_generics_and_collections.answers_c07.test8;

import java.util.ArrayList;
import java.util.List;

public class TestMain8 {
    public static void main(String[] args) {
        //B E F

    }
//    Given a method declared as:
    public static <E extends Number> List<E> process(List<E> nums){
//        A programmer wants to use this method like this:
        // INSERT DECLARATIONS HERE
        ArrayList<Integer> input = null;
        List<Integer> output = null;
        output = process(input);

        return nums;
    }
}
/*Which pairs of declarations could be placed at // INSERT DECLARATIONS HERE to allow the
code to compile? (Choose all that apply.)

-A. ArrayList<Integer> input = null;
ArrayList<Integer> output = null;

+B. ArrayList<Integer> input = null;
List<Integer> output = null;

-C. ArrayList<Integer> input = null;
List<Number> output = null;

-D. List<Number> input = null;
ArrayList<Integer> output = null;

+E. List<Number> input = null;
List<Number> output = null;

+F. List<Integer> input = null;
List<Integer> output = null;

-G. None of the above*/

/*Answer:
        ✓ B, E, and F are correct.
         The return type of process is definitely declared as a List, not an ArrayList, so A and D
are wrong. C is wrong because the return type evaluates to List<Integer>, and that can't
be assigned to a variable of type List<Number>. Of course all these would probably cause a
NullPointerException since the variables are still null—but the question only asked us
to get the code to compile. (Objective 6.4)*/
