package com.vladproduction.c04_operators.arithmetics;

public class IncrementDecrementTesting {

    static int players = 0;

    public static void main(String[] args) {
        System.out.println("players online now: " + players++); //printing current value and making increment by +1
        System.out.println("players now after incrementing: " + players);//print result with containing increment (by postfix)
        System.out.println("players is (after prefix increment) " + ++players); //(making prefix increment) and printing the result
    }
}
