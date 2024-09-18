package com.vladproduction.c02_object_orientation.answers_c02.test9;

public class Redwood extends Tree{
    public static void main(String[] args) {
        System.out.println("@@@@@@@@@@@@@@@@@@main");
        new Redwood().go();
    }

    void go() {
        System.out.println("@@@@@@@@@@@@@@@@@@go");
        go2(new Tree(), new Redwood());
//        go2((Redwood)new Tree(), new Redwood());
    }

    void go2(Tree t1, Redwood r1){
        System.out.println("@@@@@@@@@@@@@@@@@@go2");
//        Redwood r2 = (Redwood)t1;
        Tree t2 = (Tree) t1;
    }
}

/*To avoid the exception, need to ensure t1 actually refers to a Redwood object before downcasting.
    Achieving this in two ways:
 1)Create a Redwood object:
    Redwood r1 = new Redwood();
    go2(r1, new Redwood()); // No cast needed, r1 is already a Redwood
 2)Check the type before casting (safer):
    if (t1 instanceof Redwood) {
    Redwood r2 = (Redwood) t1;
    } else {
        // Handle the case where t1 is not a Redwood
    }
    Checking the type using instanceof before casting -> avoid the exception
    if t1 doesn't hold a Redwood reference
*/