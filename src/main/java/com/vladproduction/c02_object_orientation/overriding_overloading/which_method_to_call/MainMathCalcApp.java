package com.vladproduction.c02_object_orientation.overriding_overloading.which_method_to_call;

public class MainMathCalcApp {
    public static void main(String[] args) {
        MathCalculate calculate = new MathCalculate();
        calculate.addNumbs(2, 3);
        calculate.addNumbs(2.2, 3.3);
        /**
         * compiler know which method to call by list of args
         * */
    }
}
