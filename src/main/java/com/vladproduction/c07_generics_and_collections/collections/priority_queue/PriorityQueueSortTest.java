package com.vladproduction.c07_generics_and_collections.collections.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * PriorityQueue:
 * orders its elements using a user-defined priority;
 * can be ordered using a Comparator, which lets you define any ordering you want;
 * a few methods not found in other collection interfaces: peek(), poll(), and offer();
 */
public class PriorityQueueSortTest {
    public static void main(String[] args) {

        int[] ia = {1, 5, 3, 7, 6, 9, 8}; // unordered data

        //use natural order
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        //load queue use method offer(int x):
        for (int x : ia) {
            pq1.offer(x);
        }
        //review queue use method pool():
        for (int x : ia) {
            System.out.print(pq1.poll() + " "); //pool the most priority element and remove from queue
        }

        System.out.println();
        //use comparator to get custom sort (reverse)
        PQSort pqs = new PQSort(); //get comparator
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(10, pqs);
        //load queue:
        for (int x : ia) {
            pq2.offer(x);
        }
        System.out.println("size " + pq2.size());//7
        System.out.println("peek " + pq2.peek()); // '9' at the top of priority but inverted (based on comparator)
        System.out.println("size " + pq2.size());//7
        System.out.println("pool " + pq2.poll()); //poll 9 (return and remove from queue)
        System.out.println("size " + pq2.size()); //size decrease and stands 6
        //review queue:
        for (int x : ia) {
            System.out.print(pq2.poll() + " ");//review remaining elements from queue
        }


    }

    //create static class implements Comparator
    //define our custom order (inverse sorting)
    static class PQSort implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

}
