package com.vladproduction.c09_threads.answers_c09.test16;

public class ChicksYack implements Runnable{
    Chicks c;

    public static void main(String[] args) {
        new ChicksYack().go();
    }

    public void go(){
        c = new Chicks();
        new Thread(new ChicksYack()).start();
        new Thread(new ChicksYack()).start();
    }

    public void run(){
        c.yack(Thread.currentThread().getId()); //NullPointerException: Cannot invoke "Chicks.yack(long)" because "this.c" is null
    }
}

class Chicks{
    synchronized void yack(long id){
        for (int i = 1; i < 3; i++) {
            System.out.println(id + " ");
            Thread.yield();
        }
    }
}


/*Which are true? (Choose all that apply.)
A. Compilation fails
B. The output could be 4 4 2 3
C. The output could be 4 4 2 2
D. The output could be 4 4 4 2
E. The output could be 2 2 4 4
+F. An exception is thrown at runtime --> NullPointerException
*/

/*Answer:
        ✓ F is correct. When run() is invoked, it is with a new instance of ChicksYack and c has
not been assigned to an object. If c were static, then because yack is synchronized, answers
C and E would have been correct.
  A, B, C, D, and E are incorrect based on the above. (Objective 4.3)*/
