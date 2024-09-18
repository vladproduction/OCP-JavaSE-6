package com.vladproduction.c03_assignments.answers_c03.test11;

public class Tester {
    public static void main(String[] args) {
        Beta b1 = new Beta();
        Beta b2 = new Beta();
        Alpha a1 = new Alpha();
        Alpha a2 = new Alpha();
        a1.b1 = b1;
        a1.b2 = b1;
        a2.b2 = b2;
        a1 = null; b1 = null; b2 = null;
        // do stuff
        //When line  do stuff is reached, how many objects will be eligible for garbage collection?
        //An object is eligible for garbage collection when there are no more references to it.
        /*Answer:
            B is correct. It should be clear that there is still a reference to the object referred to by
            a2, and that there is still a reference to the object referred to by a2.b2. What might be
            less clear is that you can still access the other Beta object through the static variable
            a2.b1—because it's static.*/

    }
}
class Alpha {
    static Beta b1;
    Beta b2;
}
class Beta {
}
