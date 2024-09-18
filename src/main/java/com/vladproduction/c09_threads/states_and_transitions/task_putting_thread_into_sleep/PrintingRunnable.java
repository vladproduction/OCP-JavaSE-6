package com.vladproduction.c09_threads.states_and_transitions.task_putting_thread_into_sleep;

public class PrintingRunnable implements Runnable{
    @Override
    public void run() {
        //first version:
//        for (int i = 0; i < 100; i++) {
//            /*the modulo operation to check whether there are any remainder numbers when divided by 10*/
//            if (i % 10 == 0) {
//                System.out.println(i); // Print the number if it has no remainder
//                try {
//                    Thread.sleep(1000); //pause 1 sec
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

        //second version (effective refactoring by task requirements):
        for (int i = 1; i <= 100; i++) { // Count from 1 to 100
            System.out.println(i); // Print the current number

            // Check if we are at a multiple of 10 and output a message
            if (i % 10 == 0) {
                System.out.println("Reached " + i + "!");
                try {
                    Thread.sleep(1000); //just for fun one more 1 sec pause in time after point reached
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            // Pause for 1 second
            try {
                Thread.sleep(100); // sleep for 100 milliseconds (0.1 second)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Preserve interrupt status
                System.out.println("Thread was interrupted!");
            }
        }
    }
}
