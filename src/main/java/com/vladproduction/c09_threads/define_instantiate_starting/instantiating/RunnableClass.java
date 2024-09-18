package com.vladproduction.c09_threads.define_instantiate_starting.instantiating;

/**
 * common way to think about this is that the Thread is the
 * "worker," and the Runnable is the "job" to be done
 * */
public class RunnableClass implements Runnable{
    public static void main(String[] args) {
        RunnableClass task = new RunnableClass();
        Thread worker = new Thread(task);
        worker.start();

        //could build many workers we want to do our task:
        /*Giving the same target to multiple threads means that several threads of
        execution will be running the very same job (and that the same job will be done
        multiple times).*/
        Thread foo = new Thread(task);
        Thread bar = new Thread(task);
        Thread bat = new Thread(task);
        Thread[] threads = new Thread[3];
        threads[0] = foo;
        threads[1] = bar;
        threads[2] = bat;
        for (Thread thread : threads) {
            thread.start();
        }
    }

    /*there are other overloaded constructors
    in class Thread:*/
        //1■ Thread()
        //2■ Thread(Runnable target)
        //3■ Thread(Runnable target, String name)
        //4■ Thread(String name)

    //ALIVE OR DEAD:
    //the thread is not yet considered to be alive till the start() method is invoked;
    //Once the start() method is called, the thread is considered to be alive
            //(even though the run() method may not have actually started executing yet)
    //A thread is considered dead (no longer alive) after the run() method completes


    @Override
    public void run() {
        System.out.println("run start");
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable class: " + i);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("run finish");
    }
}
