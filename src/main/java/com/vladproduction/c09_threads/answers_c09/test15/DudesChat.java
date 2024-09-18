package com.vladproduction.c09_threads.answers_c09.test15;

public class DudesChat implements Runnable {
    static Dudes d;

    public static void main(String[] args) {
        new DudesChat().go();
        //1)yo yo dude dude
        //2)yo yo dude dude
    }

    void go() {
        d = new Dudes();
        new Thread(new DudesChat()).start();
        new Thread(new DudesChat()).start();
    }

    public void run() {
        d.chat(Thread.currentThread().getId());
    }

}

class Dudes {
    static long flag = 0;

    // insert code here:
    //I.synchronized
    /*synchronized void chat(long id) {
        if (flag == 0) flag = id;
        for (int x = 1; x < 3; x++) {
            if (flag == id) System.out.print("yo ");
            else System.out.print("dude ");
        }
    }*/
    //II.not synchronized
    void chat(long id) {
        if (flag == 0) flag = id;
        for (int x = 1; x < 3; x++) {
            if (flag == id) System.out.print("yo ");
            else System.out.print("dude ");
        }
    }
}

/*fragments:
I.    synchronized void chat(long id) {
II.                void chat(long id) {
*/

/*When fragment I or fragment II is inserted at line 5, which are true? (Choose all that apply.)
-A. An exception is thrown at runtime
-B. With fragment I, compilation fails
-C. With fragment II, compilation fails
-D. With fragment I, the output could be yo dude dude yo
-E. With fragment I, the output could be dude dude yo yo
+F. With fragment II, the output could be yo dude dude yo*/

/*Answer:
        ✓ F is correct. With fragment I, the chat method is synchronized, so the two threads can't
swap back and forth. With either fragment, the first output must be yo.
         A, B, C, D, and E are incorrect based on the above. (Objective 4.3)*/


