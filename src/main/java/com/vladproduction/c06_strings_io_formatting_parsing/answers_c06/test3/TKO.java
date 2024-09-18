package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test3;

public class TKO {
    public static void main(String[] args) {
        /* original source version:
        String s = "-";
        Integer x = 343;
        long L343 = 343L;
        if(x.equals(L343)){
            s += ".e1 ";
        }
        if(x.equals(343)){
            s += ".e2 ";
        }
        Short s1 = (short)((new Short((short)343)) / (new Short((short)49)));
        if(s1 == 7) {
            s += "=s ";
        }
        if(s1 < new Integer(7+1)) {
            s += "fly ";
        }*/

        //modern source version:
        String s = "-";
        Integer x = 343;
        long L343 = 343L;
        if(x.equals(L343)){ //true
            s += ".e1 ";
        }
        if(x.equals(343)){
            s += ".e2 ";
        }
        Short s1 = (short)((short)343 / (short)49); //7
        if(s1 == 7) { //true
            s += "=s ";
        }
        if(s1 < (7+1)) { //true
            s += "fly ";
        }
        System.out.println(s); // -.e2 =s fly
        /*Which of the following will be included in the output String s? (Choose all that apply.)
        A. .e1
        B. .e2
        C. =s
        D. fly
        E. None of the above
        F. Compilation fails
        G. An exception is thrown at runtime*/

        //answer: B C D

        /*Answer:
  ✓ B, C, and D are correct. Remember, that the equals() method for the integer wrappers
        will only return true if the two primitive types and the two values are equal. With C, it's
        okay to unbox and use ==. For D, it's okay to create a wrapper object with an expression,
        and unbox it for comparison with a primitive.
  A, E, F, and G are incorrect based on the above. (Remember that A is using the equals()
        method to try to compare two different types.) (Objective 3.1)*/
    }
}
