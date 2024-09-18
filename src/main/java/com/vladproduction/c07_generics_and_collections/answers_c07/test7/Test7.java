package com.vladproduction.c07_generics_and_collections.answers_c07.test7;

public class Test7 {
    /*Which collection class(es) allows you to grow or shrink its size and provides indexed access to
    its elements, but whose methods are not synchronized? (Choose all that apply.)
    A. java.util.HashSet
    B. java.util.LinkedHashSet
    C. java.util.List
    +D. java.util.ArrayList
    E. java.util.Vector
    F. java.util.PriorityQueue*/

    /*Answer:
            ✓ D is correct. All of the collection classes allow you to grow or shrink the size of your
    collection. ArrayList provides an index to its elements. The newer collection classes
    tend not to have synchronized methods. Vector is an older implementation of ArrayList
    functionality and has synchronized methods; it is slower than ArrayList.
  A, B, C, E, and F are incorrect based on the logic described above; Notes: C, List is an
    interface, and F, PriorityQueue does not offer access by index. (Objective 6.1)*/
}
