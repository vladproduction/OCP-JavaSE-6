package com.vladproduction.c04_operators.arithmetics;

public class ReminderTest {
    public static void main(String[] args) {
        int x = 15;
        int y = x % 4;
        System.out.println("The result of 15 % 4 is the "
                + "remainder of 15 divided by 4. The remainder is " + y);
    }
    /*  (Remember: Expressions are evaluated from left to right by default. You can change
        this sequence, or precedence, by adding parentheses. Also remember that the * , / ,
        and % operators have a higher precedence than the + and - operators.)
     */
}
