package com.vladproduction.c09_threads.synchronizing_code.examples;


/**
 * What if we need to access both static and non-static fields in a method?
 * It's crucial to synchronize correctly based on the type of field being accessed.
 * Always ensure that shared resources are properly synchronized to avoid race conditions.
 * */
public class SynchronizedFieldsExample {
    private static int staticField = 0; // Static field, belong to the class itself
    private int nonStaticField = 0; // Non-Static field, associated with individual instances
                                    //each instance has it`s own copy of non-static field

    public static void main(String[] args) throws InterruptedException{
        SynchronizedFieldsExample instance1 = new SynchronizedFieldsExample();
        SynchronizedFieldsExample instance2 = new SynchronizedFieldsExample();

        // Create threads that access the fields
        Thread thread1 = new Thread(instance1::incrementFields, "Thread 1");

        Thread thread2 = new Thread(instance2::incrementFields, "Thread 2");

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for threads to complete
        thread1.join();
        thread2.join();

        // Display final values
        System.out.println("Final staticField: " + staticField);
        System.out.println("Final nonStaticField for instance1: " + instance1.nonStaticField);
        System.out.println("Final nonStaticField for instance2: " + instance2.nonStaticField);

        /*Thread Creation and Execution:
        Two threads, Thread 1 and Thread 2, are created, each operating on different instances of SynchronizedFieldsExample.
        Each thread will increment its own non-static field while also trying to increment the shared static field.*/
    }

    //IMPORTANT:
    /*If you want a method to be synchronized based on both static and non-static fields,
    you should use a combination of synchronization techniques.
    You can synchronize on the instance (this) for non-static fields and
    on the class type (e.g., ClassName.class) for static fields.*/
    // Method to increment both static and non-static fields
    public void incrementFields() {
        synchronized (this) {
            nonStaticField++;
            System.out.println(Thread.currentThread().getName() + " incremented nonStaticField to: " + nonStaticField);
        }

        synchronized (SynchronizedFieldsExample.class) {
            staticField++;
            System.out.println(Thread.currentThread().getName() + " incremented staticField to: " + staticField);
        }
    }

    /*Incrementing in a Synchronized Manner:
    The method incrementFields() first synchronizes on 'this' to safely increment the nonStaticField for the specific instance.
    It then synchronizes on SynchronizedFieldsExample.class, ensuring that access to the staticField is thread-safe,
    as all instances reference this same class lock.*/
}
