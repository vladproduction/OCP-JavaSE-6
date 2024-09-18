package com.vladproduction.c03_assignments.assignments;

public class AssignmentTesting {
    public static void main(String[] args) {

        //Assigning Floating-Point Numbers
        //floating-point literal is implicitly a double (64 bits)
        //must either cast the value or append an f to the end of the literal
//        float f = 32.3;
        //so this is ok:
        float f = (float) 32.3;
        float g = 32.3f;
        float h = 32.3F;

        //Assigning a Literal That Is Too Large for the Variable
//        byte a = 128; // byte can only hold up to 127
        byte a = (byte) 128; //here we fix the problem
        //and result is:
        System.out.println("a = " + a); //-128

        //example for the compound assignment operators
        byte b = 3;
        b += 7;
        System.out.println("b = " + b); //10
        //or equivalent to:
        b = (byte) (b + 7); //so casting is used here
        System.out.println("b = (byte) (b + 7) = " + b); //17 (because current value of b is 10)

        /**
         * The compound assignment operator += lets you add to the value of b, without
         * putting in an explicit cast. In fact, +=, -=, *=, and /= will all put in an implicit cast.
         * */

    }
}
