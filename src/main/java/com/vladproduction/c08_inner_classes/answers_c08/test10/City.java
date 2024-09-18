package com.vladproduction.c08_inner_classes.answers_c08.test10;

public class City {
    class Manhattan{
        void doStuff() throws Exception { System.out.print("x "); }
    }
    class TimesSquare extends Manhattan{
        void doStuff() throws Exception { } //overrode (will invoke first)
    }

    public static void main(String[] args) throws Exception{
        new City().go();
    }
    void go() throws Exception{
        new TimesSquare().doStuff();
    }
}

/*What is the result?
A. x
B. x x
+C. No output is produced
D. Compilation fails due to multiple errors
E. Compilation fails due only to an error on line 4
F. Compilation fails due only to an error on line 7
G. Compilation fails due only to an error on line 10
H. Compilation fails due only to an error on line 13*/

/*Answer:
        ✓ C is correct. The inner classes are valid, and all the methods (including main()), correctly
throw an Exception, given that doStuff() throws an Exception. The doStuff() in class
TimesSquare overrides class Manhattan's doStuff() and produces no output.
         A, B, D, E, F, G, and H are incorrect based on the above. (Objectives 1.1, 2.4)*/

