package com.vladproduction.c03_assignments.literals;

public class Octal {
    public static void main(String[] args) {
        int six = 06; // Equal to decimal 6
        int seven = 07; // Equal to decimal 7
        int eight = 010; // Equal to decimal 8
        int nine = 011; // Equal to decimal 9
        System.out.println("Octal 010 = " + eight);
    }
    /**
     * when we get past seven and are out of digits to use (we are allowed
     * only the digits 0 through 7 for octal numbers), we revert back to zero, and one is
     * added to the beginning of the number. You can have up to 21 digits in an octal
     * number, not including the leading zero
     * */
}
