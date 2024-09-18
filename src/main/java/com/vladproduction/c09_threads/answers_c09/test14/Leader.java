package com.vladproduction.c09_threads.answers_c09.test14;

public class Leader implements Runnable{
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Leader());
        t.start();
        System.out.print("m1 ");
        t.join();
        System.out.print("m2 ");
    }

    public void run(){
        System.out.print("r1 ");
        System.out.print("r2 ");
    }
}

/*Which are true? (Choose all that apply.)
+A. Compilation fails --> need to catch exception throwing by join() method
B. The output could be r1 r2 m1 m2
C. The output could be m1 m2 r1 r2
D. The output could be m1 r1 r2 m2 --> in case exception throw
E. The output could be m1 r1 m2 r2
F. An exception is thrown at runtime*/

/*Answer:
        ✓ A is correct. The join() must be placed in a try/catch block. If it were, answers B and
D would be correct. The join() causes the main thread to pause and join the end of the
        other thread, meaning "m2" must come last.
  B, C, D, E, and F are incorrect based on the above. (Objective 4.2)*/
