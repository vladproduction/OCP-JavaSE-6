package com.vladproduction.c03_assignments.array_declaration_construction_initialization;

import java.util.Arrays;

public class InitElementsInLoops {
    public static void main(String[] args) {
        /**
         * The last index value, then, is always one less than the length.
         * For example, if the length of an array is 4, the index values are from 0 through 3.
         * */

        Element [] elements = new Element[5]; //creates an array of 5 Element.class References
        for (int i = 0; i < elements.length; i++) {
            elements[i] = new Element(i + 1); //assign to the index position 'i'
            System.out.print(elements[i] + "; ");
        }

        /**
         * The length variable tells us how many elements the array holds, but it does not
         * tell us whether those elements have been initialized;
         * */
    }
}

class Element{
    private int n;

    public Element(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "el: " + n;
    }
}
