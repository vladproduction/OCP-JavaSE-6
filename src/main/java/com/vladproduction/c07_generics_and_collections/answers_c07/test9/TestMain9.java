package com.vladproduction.c07_generics_and_collections.answers_c07.test9;

import java.util.PriorityQueue;

public class TestMain9 {
    public static void main(String[] args) {
//        my_version();
        source_task();
    }

    private static void source_task() {
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("2");
        pq.add("4");
        System.out.print(pq.peek() + " ");
        pq.offer("1");
        pq.add("3");
        pq.remove("1");
        System.out.print(pq.poll() + " ");
        if(pq.remove("2")) System.out.print(pq.poll() + " ");
        System.out.println(pq.poll() + " " + pq.peek());
    }

    private static void my_version() {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("2");
        pq.add("4");
        System.out.println(pq); //2,4

        System.out.print(pq.peek() + " ");//2
        System.out.println();
        System.out.println(pq);//2,4

        pq.offer("1");
        System.out.println(pq);//1,4,2

        pq.add("3");
        System.out.println(pq);//1,3,2,4

        pq.remove("1");
        System.out.println(pq);//2,3,4

        System.out.print(pq.poll() + " ");//2
        System.out.println();
        System.out.println(pq);//3,4

        if (pq.remove("2")) {
            System.out.print(pq.poll() + " ");
            System.out.println();
        }
        System.out.println(pq);//3,4

        System.out.println(pq.poll() + " " + pq.peek());//3,4
        System.out.println(pq);//4
    }
}

/*What is the result?
A. 2 2 3 3
+B. 2 2 3 4
C. 4 3 3 4
D. 2 2 3 3 3
E. 4 3 3 3 3
F. 2 2 3 3 4
G. Compilation fails
H. An exception is thrown at runtime*/

/*Answer:
        ✓ B is correct. For the sake of the exam, add() and offer() both add to (in this case),
naturally sorted queues. The calls to poll() both return and then remove the first item
from the queue, so the if test fails.
         A, C, D, E, F, G, and H are incorrect based on the above. (Objective 6.1)*/
