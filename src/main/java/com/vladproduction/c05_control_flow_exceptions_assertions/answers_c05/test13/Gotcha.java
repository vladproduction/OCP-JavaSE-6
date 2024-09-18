package com.vladproduction.c05_control_flow_exceptions_assertions.answers_c05.test13;

public class Gotcha {
    public static void main(String[] args) {

        // insert code here:
//        new Gotcha().go(); //1) StackOverFlow

        try { new Gotcha().go(); }
        catch (Error e) { System.out.println("ouch"); } //2) ouch

//        try { new Gotcha().go(); }
//        catch (Exception e) { System.out.println("ouch"); }//3) StackOverFlow

        //answer: B E

    }

    void go() {
        go();
    }

    /*
        I. new Gotcha().go();

       II. try { new Gotcha().go(); }
           catch (Error e) { System.out.println("ouch"); }

       III. try { new Gotcha().go(); }
            catch (Exception e) { System.out.println("ouch"); }
            */
}
