package com.vladproduction.c09_threads.answers_c09.test12;

public class TwoThreads {
    static Thread laurel, hardy;
    public static void main(String[] args) {
        laurel = new Thread() {
            public void run() {
                System.out.println("A"); //Immediately prints "A".
                try {
                    sleep(1000);//Sleeps for 1000 milliseconds (1 second).
                } catch (Exception e) {
                    System.out.println("B");
                }
                System.out.println("C"); //After waking up from the sleep, it prints "C".
            }
        };
        hardy = new Thread() {
            public void run() {
                System.out.println("D"); //Immediately prints "D".
                //Then tries to call laurel.wait().
                try {
                    laurel.wait(); //IllegalMonitorStateException will be thrown. The catch block catches this exception and prints "E"
                } catch (Exception e) {
                    System.out.println("E");
                }
                System.out.println("F");
            }
        };
        laurel.start();
        hardy.start();
    }
}

/*Understanding wait() and Thread States
The wait() method is used in Java to make a thread wait until another thread invokes notify() or notifyAll() on the same object.
However, wait() can only be called on synchronized objects. In this case, laurel is not synchronized, and its wait() call is illegal.
Because wait() is being called incorrectly, an IllegalMonitorStateException will be thrown. The catch block catches this exception and prints "E".*/

/* answer:
A
D
E
F
C
*/

/*Which letters will eventually appear somewhere in the output? (Choose all that apply.)
+A. A
B. B
+C. C
+D. D
+E. E
+F. F
G. The answer cannot be reliably determined
H. The code does not compile*/

/*Answer:
        ✓ A, C, D, E, and F are correct. This may look like laurel and hardy are battling to cause
the other to sleep() or wait()—but that's not the case. Since sleep() is a static
method, it affects the current thread, which is laurel (even though the method is invoked
        using a reference to hardy). That's misleading but perfectly legal, and the Thread laurel
is able to sleep with no exception, printing A and C (after at least a 1-second delay).
Meanwhile hardy tries to call laurel.wait()—but hardy has not synchronized on laurel,
so calling laurel.wait() immediately causes an IllegalMonitorStateException, and
so hardy prints D, E, and F. Although the order of the output is somewhat indeterminate
        (we have no way of knowing whether A is printed before D, for example) it is guaranteed
        that A, C, D, E, and F will all be printed in some order, eventually—so G is incorrect.
         B, G, and H are incorrect based on the above. (Objective 4.4)*/
