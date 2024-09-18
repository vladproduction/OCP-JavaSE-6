package com.vladproduction.c07_generics_and_collections.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        boolean[] ba = new boolean[5];

        //variant#1: HashSet
        Set s = new HashSet(); //care about unique elements, no order

        //variant#2: TreeSet //exception ClassCastException
        /*issue is that whenever you want a collection to be sorted, its elements must
        be mutually comparable (in our collection we have incomparable String and Integer objects)*/
//        Set s = new TreeSet();

        ba[0] = s.add("a");
        ba[1] = s.add(42);
        ba[2] = s.add("b");
        ba[3] = s.add("a"); //not add (already in)
        ba[4] = s.add(new Object());
        //check if element was added:
        int counting = 1;
        for(int x = 0; x < ba.length; x++){
            System.out.print(counting + ")" + (ba[x] + " "));
            counting++;
        }
        System.out.println("content: ");
        //print content:
        for(Object o : s)
            System.out.print(o + ", ");
    }

}
