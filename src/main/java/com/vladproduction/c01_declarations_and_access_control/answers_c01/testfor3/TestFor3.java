package com.vladproduction.c01_declarations_and_access_control.answers_c01.testfor3;

public class TestFor3 {
    public static void main(String[] args) {
        doStuff1(1);
        doStuff2(1,2);
    }

    //correct A
    static void doStuff1(int... doArgs) {
    }

    //correct E
    static void doStuff2(int i, int... doArgs) {
    }

    //incorrect B
//    static void doStuff(int [] doArgs) {
//    }

    //incorrect C
//    static void doStuff(int doArgs...){
//    }

    //incorrect D
//    static void doStuff(int ...doArgs, int y){
//    }

}
