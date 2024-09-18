package com.vladproduction.c03_assignments.variable_scope;

public class Layout {                       //class

    static int s = 343;                     // static variable
    int x;                                  // instance variable

    { x = 7; int x2 = 5; }                  // initialization block
    Layout() { x += 8; int x3 = 6;}         // constructor
    void doStuff() {                        // method
        int y = 0;                          // local variable
        for(int z = 0; z < 4; z++) {        // 'for' code block
            y += z + x;
        }
    }

}

/**
 * basic scopes:
     ■ Static variables have the longest scope; they are created when the class is
     loaded, and they survive as long as the class stays loaded in the Java Virtual
     Machine (JVM).
     ■ Instance variables are the next most long-lived; they are created when a new
     instance is created, and they live until the instance is removed.
     ■ Local variables are next; they live as long as their method remains on the
     stack. As we'll soon see, however, local variables can be alive, and still be
     "out of scope".
     ■ Block variables live only as long as the code block is executing.
 * */
