package com.vladproduction.c09_threads.states_and_transitions.task_putting_thread_into_sleep;

public class PrintingRunnableMain {
    public static void main(String[] args) {
        System.out.println("MAIN THREAD START");
        PrintingRunnable pr = new PrintingRunnable();
        Thread thread = new Thread(pr);
        thread.start();

        // Optional: Join the thread if you want to wait for it to finish in the main thread
         try {
             thread.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
        System.out.println("MAIN THREAD FINISH");
    }
}
