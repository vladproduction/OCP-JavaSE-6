package com.vladproduction.c07_generics_and_collections.answers_c07.test14;

import java.util.ArrayList;

public class Travel {
    ArrayList<Hotel> go(){
    return new ArrayList<Hotel>();
}
    public static void main(String[] args) {

    }
}
/*Which, inserted independently at line 9, will compile? (Choose all that apply.)
A. return new ArrayList<Inn>();
+B. return new ArrayList<Hotel>();
C. return new ArrayList<Object>();
D. return new ArrayList<Business>();*/

/*Answer:
        ✓ B is correct.
  A is incorrect because polymorphic assignments don't apply to generic type parameters. C
and D are incorrect because they don't follow basic polymorphism rules. (Objective 6.4)*/

class Business { }
class Hotel extends Business { }
class Inn extends Hotel { }
