package com.vladproduction.c03_assignments.answers_c03.test10;

public class Eggs {
    public static void main(String[] args) {
        Dozens [] da = new Dozens[3];
        da[0] = new Dozens();
        Dozens d = new Dozens();//The Dozens object created
        da[1] = d;//It was initially assigned to the variable d
        d = null;//However, d was later set to null, removing the only reference to this object
        da[1] = null;//When da[1] is set to null, the last reference to this object is removed
        // do stuff
//        Which two are true about the objects created within main(), and eligible for garbage collection
//        when line 11 is reached?

        /*Answer:
            C and F are correct. da refers to an object of type "Dozens array," and each Dozens object
            that is created comes with its own "int array" object. When line do stuff is reached, only the
            second Dozens object (and its "int array" object) are not reachable.*/
    }
}
class Dozens{
    int [] dz = {1,2,3,4,5,6,7,8,9,10,11,12};
}
