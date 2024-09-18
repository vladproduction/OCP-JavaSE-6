package com.vladproduction.c02_object_orientation.answers_c02.test13;

public class ZooKeeper {
    public static void main(String[] args) {
        new ZooKeeper().go();
    }

    void go() {
        Mammal m = new Zebra();
        //Java determines the actual object type (Zebra)and calls the overridden method makeNoise()
        //The reference variable's type (Mammal in this case) dictates which name variable is accessed.
        System.out.println(m.name + " " + m.makeNoise()); // furry  bray
    }
}

/**
 * Reference Variable Type: When you assign the Zebra object to the Mammal reference variable m,
 * the reference variable itself (m) doesn't hold the actual object's data. It only holds a reference (memory address) to the object.
 * Since m is declared as Mammal, it implicitly refers to the name variable defined in the Mammal class,
 * which has the value "furry ".
 * */

/**
 * Method Call: In the line System.out.println(m.name + m.makeNoise());, two separate method calls happen:
 * m.name: This accesses the name variable through the Mammal reference (m), so it returns "furry ".
 * m.makeNoise(): Due to dynamic dispatch, Java determines the actual object type (Zebra)
 * and calls the overridden makeNoise() method from the Zebra class, which returns "bray".
 * */
