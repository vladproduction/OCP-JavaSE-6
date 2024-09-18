package com.vladproduction.c07_generics_and_collections.answers_c07.test11;

import java.util.LinkedHashSet;


public class TurtleTest {
    public static void main(String[] args) {
        LinkedHashSet<Turtle> t = new LinkedHashSet<>();
        t.add(new Turtle(1));
        t.add(new Turtle(2));
        t.add(new Turtle(1));
        System.out.println(t.size());
    }
}

/*two fragments:
I. public int hashCode() { return size/5; }
II. // no hashCode method declared*/

/*If fragment I or II is inserted, independently, at line 8, which are true? (Choose all that apply.)
+A. If fragment I is inserted, the output is 2
B. If fragment I is inserted, the output is 3
C. If fragment II is inserted, the output is 2
+D. If fragment II is inserted, the output is 3
E. If fragment I is inserted, compilation fails
F. If fragment II is inserted, compilation fails*/

/*Answer:
        ✓ A and D are correct. While fragment II wouldn’t fulfill the hashCode() contract (as you
can see by the results), it is legal Java. For the purpose of the exam, if you don’t override
hashCode(), every object will have a unique hashcode.
         B, C, E, and F are incorrect based on the above. (Objective 6.2)*/
