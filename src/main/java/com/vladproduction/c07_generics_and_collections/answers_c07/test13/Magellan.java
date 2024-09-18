package com.vladproduction.c07_generics_and_collections.answers_c07.test13;

import java.util.SortedMap;
import java.util.TreeMap;

public class Magellan {
    public static void main(String[] args) {
        TreeMap<String, String> myMap = new TreeMap<>();
        myMap.put("a", "apple");
        myMap.put("d", "date");
        myMap.put("f", "fig");
        myMap.put("p", "pear");
        System.out.println(myMap);

        System.out.println("1st after mango: " + // sop 1
                myMap.higherKey("f"));//p
        System.out.println("1st after mango: " + // sop 2
                myMap.ceilingKey("f")); //f (the least key greater than or equal)
        System.out.println("1st after mango: " + // sop 3
                myMap.floorKey("f"));//f (greatest key less than or equal)
        SortedMap<String, String> sub;
        sub = myMap.tailMap("f"); //inclusively [f, p]
        System.out.println("1st after mango: " + // sop 4
                sub.firstKey());//f

    }
}

/*Which of the System.out.println statements will produce the output: (1st after mango: p) ?
        (Choose all that apply.)
+A. sop 1
B. sop 2
C. sop 3
D. sop 4
E. None; compilation fails
F. None; an exception is thrown at runtime*/

/*Answer:
        ✓ A is correct. The ceilingKey() method's argument is inclusive. The floorKey() method
would be used to find keys before the specified key. The firstKey() method's argument is
also inclusive.
         B, C, D, E, and F are incorrect based on the above. (Objective 6.3)*/
