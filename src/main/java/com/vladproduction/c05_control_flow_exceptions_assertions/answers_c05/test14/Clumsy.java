package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test14;

public class Clumsy {
    public static void main(String[] args) {

        int j = 7;
        assert(++j > 7);
        assert(++j > 8): "hi";
        assert(j > 10): j = 12;
//        assert(j==12): doStuff();
        assert(j==12): new Clumsy();

//        E. Compilation fails due to an error on line 9

    }

    static void doStuff() { }

}
