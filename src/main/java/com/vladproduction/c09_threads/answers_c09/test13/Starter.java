package com.vladproduction.c09_threads.answers_c09.test13;

public class Starter implements Runnable {
    void go(long id){
        System.out.println(id);
    }

    public static void main(String[] args) {
        System.out.print(Thread.currentThread().getId() + " ");
        //insert code here:
        new Starter().run();//1 1
//        new Starter().start();// no such method in Starter class
        new Thread(new Starter()); //1
        new Thread(new Starter()).run(); //1 1
        new Thread(new Starter()).start(); //1 24
    }

    @Override
    public void run() {
        go(Thread.currentThread().getId());
    }
}

/*fragments:
I.      new Starter().run();
II.     new Starter().start();
III.    new Thread(new Starter());
IV.     new Thread(new Starter()).run();
V.      new Thread(new Starter()).start();
*/

/*When the five fragments are inserted, one at a time at line 9, which are true? (Choose all that apply.)
A. All five will compile
B. Only one might produce the output 4 4
+C. Only one might produce the output 4 2
+D. Exactly two might produce the output 4 4
E. Exactly two might produce the output 4 2
F. Exactly three might produce the output 4 4
G. Exactly three might produce the output 4 2
*/

/*Answer:
  ✓ C and D are correct.
Fragment I doesn't start a new thread.
Fragment II doesn't compile.
Fragment III creates a new thread but doesn't start it.
Fragment IV creates a new thread and invokes run() directly, but it doesn’t start the new thread.
Fragment V creates and starts a new thread.
  A, B, E, F, and G are incorrect based on the above. (Objective 4.1)*/
