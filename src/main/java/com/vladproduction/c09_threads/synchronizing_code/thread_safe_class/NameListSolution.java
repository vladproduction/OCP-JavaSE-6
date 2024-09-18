package com.vladproduction.c09_threads.synchronizing_code.thread_safe_class;

import java.util.LinkedList;
import java.util.List;

/**
 * There's a solution here: don't rely on Collections.synchronizedList().
 * Instead, synchronize the code yourself;
 */
public class NameListSolution {
    //    private List names = Collections.synchronizedList(new LinkedList<>());
    private List names = new LinkedList();

    public static void main(String[] args) {
        final NameListSolution nls = new NameListSolution();
        nls.add("Ozymandias");
        class NameDropper extends Thread {
            public void run() {
                String name = nls.removeFirst();
                System.out.println(name);
            }
        }
        Thread t1 = new NameDropper();
        Thread t2 = new NameDropper();
        t1.start();
        t2.start();
    }

    /*public void add(String name) {
        names.add(name);
    }

    public String removeFirst() {
        if (names.size() > 0)
            return (String) names.remove(0);
        else
            return null;
    }*/

    /*Now the entire removeFirst() method is synchronized, and once one thread
    starts it and calls names.size(), there's no way the other thread can cut in and
    steal the last name. The other thread will just have to wait until the first thread
    completes the removeFirst() method.*/

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized String removeFirst() {
        if (names.size() > 0)
            return (String) names.remove(0);
        else
            return null;
    }
}
