package com.vladproduction.c09_threads.synchronizing_code.thread_safe_class;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * The method Collections.synchronizedList() returns a List whose methods
 * are all synchronized and "thread-safe" according to the documentation.
 * but could it be used safely by different threads?
 * So names.size() is synchronized, and names.remove(0) is synchronized. But nothing prevents
 * another thread from doing something else to the list in between those two calls. Might be problem
 */
public class NameList {
    private List names = Collections.synchronizedList(new LinkedList<>());

    public static void main(String[] args) {
        final NameList nl = new NameList();
        nl.add("Ozymandias");
        class NameDropper extends Thread {
            public void run() {
                String name = nl.removeFirst();
                System.out.println(name);
            }
        }
        Thread t1 = new NameDropper();
        Thread t2 = new NameDropper();
        t1.start();
        t2.start();
    }

    public void add(String name) {
        names.add(name);
    }

    public String removeFirst() {
        if (names.size() > 0)
            return (String) names.remove(0);
        else
            return null;
    }
}
