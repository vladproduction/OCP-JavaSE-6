package com.vladproduction.c07_generics_and_collections.answers_c07.test12;

import java.util.TreeSet;

public class Test12 {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<String>();
        TreeSet<String> subs = new TreeSet<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("e");
        subs = (TreeSet) s.subSet("b", true, "d", true);//bcd
        System.out.println(subs);
        s.add("g");
        String s1 = s.pollFirst();
        System.out.println("s1 = " + s1);//a
        s.pollFirst(); //b
        s.add("c2");
        System.out.println(s); //[c, c2, d, e, g]
        System.out.println(s.size() + " " + subs.size());//5 3

        /*sorted naturally*/
    }
}
/*Which are true? (Choose all that apply.)
A. The size of s is 4
B. The size of s is 5
C. The size of s is 7
D. The size of subs is 1
E. The size of subs is 2
F. The size of subs is 3
G. The size of subs is 4
H. An exception is thrown at runtime*/

/*Answer:
        ✓ B and F are correct. After "g" is added, TreeSet s contains six elements and TreeSet subs
contains three (b, c, d), because "g" is out of the range of subs. The first pollFirst()
finds and removes only the "a". The second pollFirst() finds and removes the "b" from
both TreeSets (remember they are backed). The final add() is in range of both TreeSets.
The final contents are [c,c2,d,e,g] and [c,c2,d].
         A, C, D, E, G, and H are incorrect based on the above. (Objective 6.3)*/
