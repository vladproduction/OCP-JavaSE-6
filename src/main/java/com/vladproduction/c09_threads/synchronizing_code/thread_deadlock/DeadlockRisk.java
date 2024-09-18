package com.vladproduction.c09_threads.synchronizing_code.thread_deadlock;

/**
 * deadlock example;
 * A deadlock occurs when two or more threads are blocked forever, waiting for each other. This typically happens when:
 * Thread A holds a lock on Resource 1 and waits to acquire a lock on Resource 2.
 * Thread B holds a lock on Resource 2 and waits to acquire a lock on Resource 1.
 * To avoid deadlocks in general, it's essential to ensure that all threads acquire locks in a consistent order and avoid
 * calling methods that acquire locks while holding other locks unless absolutely necessary.
 */
public class DeadlockRisk {

    private static class Resource {
        public int value;
    }

    private Resource resourceA = new Resource();
    private Resource resourceB = new Resource();

    //deadlock version:
    /*public int read() {
        synchronized (resourceA) { // May deadlock here
            synchronized (resourceB) {
                return resourceB.value + resourceA.value;
            }
        }
    }

    public void write(int a, int b) {
        synchronized (resourceB) { // May deadlock here
            synchronized (resourceA) {
                resourceA.value = a;
                resourceB.value = b;
            }
        }
    }*/

    //fixed version:
    public int read() {
        synchronized (resourceA) { // May deadlock here
            synchronized (resourceB) {
                return resourceB.value + resourceA.value;
            }
        }
    }

    public void write(int a, int b) {
        synchronized (resourceA) { // swapped
            synchronized (resourceB) {
                resourceA.value = a;
                resourceB.value = b;
            }
        }
    }
}

/*The preceding simple example is easy to fix; just swap the order of locking for
either the reader or the writer at lines 16 and 17 (or lines 8 and 9).

There are design approaches that can help avoid
deadlock, including strategies for always acquiring locks in a predetermined order.
Have to study and must be clear everything by this chapter*/
