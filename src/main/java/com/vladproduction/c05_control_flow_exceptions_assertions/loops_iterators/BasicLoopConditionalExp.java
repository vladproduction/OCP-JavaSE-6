package com.vladproduction.c05_control_flow_exceptions_assertions.loops_iterators;

public class BasicLoopConditionalExp {
    public static void main(String[] args) {

        //legal:
        int y = 5;
        for (int x = 0; ((((x < 10) && (y-- > 2)) | x == 3)); x++) { }

        //not legal:
//        for (int x = 0; (x > 5), (y < 2); x++) { } // too many
        //expressions

    }
}
