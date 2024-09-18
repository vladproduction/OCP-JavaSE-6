package com.vladproduction.c03_assignments.answers_c03.test4;

public class Mixer {
    Mixer(){}
    Mixer(Mixer m){m1 = m;}
    Mixer m1;

    public static void main(String[] args) {
        Mixer m2 = new Mixer();
        Mixer m3 = new Mixer(m2);
        m3.go();
        Mixer m4 = m3.m1;
        m4.go();
        Mixer m5 = m2.m1;
        m5.go(); //NullPointerException: Cannot invoke Mixer.go() because "m5" is null
        //answer is: 'F';
        //hi hi followed exception
    }
    void go(){
        System.out.print("hi ");
    }
}
