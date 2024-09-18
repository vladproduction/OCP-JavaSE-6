package com.vladproduction.c04_operators.logical;

public class TestOR {
    public static void main(String[] args) {
        //short-circuit example (trying to find true in the next one even first evaluation was false)
        //3,7,6,9
        if((isSmaller(3)) || (isSmaller(7))){
            System.out.println("result is true");
        }
        if((isSmaller(6)) || (isSmaller(9))){
            System.out.println("result is true");
        }
        /*i < 5
        result is true
        i >= 5
        i >= 5*/

        //can not apply in int values
//        if (5 && 6) { }

    }

    public static boolean isSmaller(int i){
        if(i < 5){
            System.out.println("i < 5");
            return true;
        } else {
            System.out.println("i >= 5");
            return false;
        }
    }

}
