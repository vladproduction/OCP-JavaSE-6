package com.vladproduction.c09_threads.answers_c09.test17;

public class Chess implements Runnable{
    public static void main(String[] args) {
        Chess ch = new Chess();
        new Thread(ch).start();
        new Thread(new Chess()).start();
        //output:
        //1)25 24 25 24
        //2)25 24 25 24

    }

    @Override
    public void run() {
        move(Thread.currentThread().getId());
    }

    //1) synchronized method move(Id)
    /*synchronized void move(long id) {
        System.out.print(id + " ");
        System.out.print(id + " ");
    }*/

    //2) not-synchronized method move(Id)
    void move(long id) {
        System.out.print(id + " ");
        System.out.print(id + " ");
    }
}

/*fragments:
I. synchronized void move(long id) {
II. void move(long id) {*/

/*When either fragment I or fragment II is inserted at line 7, which are true? (Choose all that apply.)
-A. Compilation fails
-B. With fragment I, an exception is thrown
+C. With fragment I, the output could be 4 2 4 2
-D. With fragment I, the output could be 4 4 2 3
+E. With fragment II, the output could be 2 4 2 4*/

/*Answer:
        ✓ C and E are correct. E should be obvious. C is correct because even though move() is
synchronized, it's being invoked on two different objects.
         A, B, and D are incorrect based on the above. (Objective 4.3)*/
