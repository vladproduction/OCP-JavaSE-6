package com.vladproduction.c03_assignments.answers_c03.test1;

public class ClassBoard {
    Short story = 200;
    ClassBoard go(ClassBoard cb){
        cb = null;
        return cb;
    }

    public static void main(String[] args) {
        ClassBoard cb1 = new ClassBoard();
        ClassBoard cb2 = new ClassBoard();
        ClassBoard cb3 = cb1.go(cb2);
        //other logic
        //how many objects are eligible for GC after reach 'other logic'?
        //C
    }
}
