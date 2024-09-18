package com.vladproduction.c09_threads.synchronizing_code.examples;


import static java.lang.Thread.*;

/**
 * Example of how to implement the Singleton pattern using the Bill Pugh Singleton Design Pattern.
 * This approach leverages a static inner helper class to hold the singleton instance,
 * ensuring it's only created when needed, which is thread-safe and efficient.
 * */
public class SingletonThreadExample {
    public static void main(String[] args) {

        Thread thread1 = new Thread(()-> {
            SingletonClass singletonClass = SingletonClass.getInstance();
            singletonClass.someBusinessLogic();
        });

        Thread thread2 = new Thread(()-> {
            SingletonClass singletonClass = SingletonClass.getInstance();
            singletonClass.someBusinessLogic();
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        System.out.println("Both threads have finished execution.");
    }
}

class SingletonClass{

    // Private constructor prevents instantiation from other classes
    private SingletonClass(){}

    // Static inner class responsible for holding the Singleton instance
    private static class SingletonHelper{
        private static final SingletonClass INSTANCE = new SingletonClass();
    }

    // Global access point to the singleton instance
    public static SingletonClass getInstance(){
        return SingletonHelper.INSTANCE;
    }

    // Example method to demonstrate the singleton's functionality
    public void someBusinessLogic(){
        final String currentThreadName = currentThread().getName();
        System.out.printf("Executing some business logic in the Singleton instance by thread: %s\n",
                currentThreadName);
    }

}
