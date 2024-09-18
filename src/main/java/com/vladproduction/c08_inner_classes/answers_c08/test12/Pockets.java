package com.vladproduction.c08_inner_classes.answers_c08.test12;

import java.util.Arrays;
import java.util.Comparator;

public class Pockets {
    public static void main(String[] args) {
        String [] sa = {"nickel", "button", "key", "lint"};
        Sorter s = new Sorter(); //need to have inner class as static (to compile), or out of scope from Pockets
        for (String string : sa) {
            System.out.print(string + " "); //nickel button key lint --> not sorted yet
        }
        Arrays.sort(sa, s);
        System.out.println();
        for (String string : sa) {
            System.out.print(string + " "); //nickel lint key button --> sorted desc
        }
    }
    static class Sorter implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}


/*What is the result?
+A. Compilation fails

B. button key lint nickel
nickel lint key button

C. nickel button key lint
button key lint nickel

D. nickel button key lint
nickel button key lint

E. nickel button key lint
nickel lint key button

F. An exception is thrown at runtime*/

/*Answer:
        ✓ A is correct, the inner class Sorter must be declared static to be called from the static
method main(). If Sorter had been static, answer E would be correct.
  B, C, D, E, and F are incorrect based on the above. (Objectives 1.1, 1.4, 6.5)*/
