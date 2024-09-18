package com.vladproduction.c07_generics_and_collections.answers_c07.test4;

import java.util.HashMap;
import java.util.Map;

public class MapEqualityTest4 {
    public static void main(String[] args) {
        Map<ToDos, String> m = new HashMap<>();
        ToDos t1 = new ToDos("Monday");
        System.out.println("t1.hashCode() = " + t1.hashCode());
        ToDos t2 = new ToDos("Monday");
        System.out.println("t2.hashCode() = " + t2.hashCode());
        ToDos t3 = new ToDos("Tuesday");
        System.out.println("t3.hashCode() = " + t3.hashCode());
        m.put(t1, "doLaundry");
        m.put(t2, "payBills");
        m.put(t3, "cleanAttic");
        System.out.println(m.size());
        int count = 1;
        for (String value : m.values()) {
            System.out.println(count + " toDos: " + value);
            count++;
        }
        System.out.println();
    }
}

class ToDos{
    String day;
    public ToDos(String day) {
        this.day = day;
    }
    public boolean equals(Object o){
        return ((ToDos)o).day == this.day;
    }
//    public int hashCode(){ return 9; } hashCode stands commented by default;
}

/*Which is correct? (Choose all that apply.)
-A. As the code stands it will not compile
-B. As the code stands the output will be 2
+C. As the code stands the output will be 3
+D. If the hashCode() method is uncommented the output will be 2
-E. If the hashCode() method is uncommented the output will be 3
-F. If the hashCode() method is uncommented the code will not compile*/

//==>commented hasCode give us hashCode for Object, (but uncommented '9' value for all elements in a map),
// '==' compare memory address but not context,
// as long as we have created different objects (and they are different because hashCode different)
//so on the map we will have 3 independent objects (even the context by 'day' is the same)
/*      output:
        t1.hashCode() = 455659002
        t2.hashCode() = 1149319664
        t3.hashCode() = 2093631819
        3
        1 toDos: payBills
        2 toDos: cleanAttic
        3 toDos: doLaundry*/

//==>uncommented our hashCode give 9 all the time, so after that at the bucket we have 3 elements;
//and we have to check them by our 'not good overridden' equals() where we compare the memory location, but for Strings we have String pool
//where two String are equal if they have same context; for t1 and t2 it`s true so in the map (where keys are unique) will be added only one Monday (t2),
// the first one (t1) will be rewritten
/*      output:
        t1.hashCode() = 9
        t2.hashCode() = 9
        t3.hashCode() = 9
        2
        1 toDos: payBills
        2 toDos: cleanAttic*/

/*Answer:
        ✓ C and D are correct. If hashCode() is not overridden then every entry will go into its own
bucket, and the overridden equals() method will have no effect on determining equivalency.
If hashCode() is overridden, then the overridden equals() method will view t1 and
t2 as duplicates.
  A, B, E, and F are incorrect based on the above. (Objective 6.2)*/

