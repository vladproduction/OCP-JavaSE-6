package com.vladproduction.c02_object_orientation.statics;



public class Test2 {
    public static void main(String[] args) {

        BrandA [] a = {new BrandA(), new BrandB(), new BrandA()};
        for (int i = 0; i < a.length; i++) {
//            a[i].doStuff();
            //or access static via BrandA reference
            BrandA.doStuff();
//            BrandB.doStuff();

        }

    }
}

class BrandA{
    static void doStuff() {
        System.out.print("a ");
    }
}

class BrandB extends BrandA{
    static void doStuff() { // it's a redefinition,
                            // not an override
        System.out.print("b ");
    }
}
