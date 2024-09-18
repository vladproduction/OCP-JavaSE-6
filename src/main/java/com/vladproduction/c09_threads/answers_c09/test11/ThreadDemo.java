package com.vladproduction.c09_threads.answers_c09.test11;

public class ThreadDemo {

    synchronized void a() { actBusy(); } //instance method
    //When one thread invokes x.a(), it locks the instance x,
    //meaning that no other thread can call any synchronized instance method (a())
    //on the same instance until the lock is released.
    static synchronized void b() { actBusy(); } //static method
    //When one thread invokes x.b(), it locks the class object associated with ThreadDemo.
    //This means that no other thread can invoke any synchronized static method (b()) on the ThreadDemo class until
    //the lock is released, regardless of the instance.
    static void actBusy() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        final ThreadDemo x = new ThreadDemo();
        final ThreadDemo y = new ThreadDemo();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int option = (int)(Math.random() * 4);
                switch (option){
                    case 0: x.a();
                        System.out.print(" x.a() ");
                    break;
                    case 1: x.b();
                        System.out.print(" x.b() ");
                    break;
                    case 2: y.a();
                        System.out.print(" y.a() ");
                    break;
                    case 3: y.b();
                        System.out.print(" y.b() ");
                    break;
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.setName("#_1");
        Thread thread2 = new Thread(runnable);
        thread2.setName("#_2");
        thread1.start();
        thread2.start();
    }

}
/*Answer:
        ✓ A, F, and H. A is a right answer because when synchronized instance methods are called
on the same instance, they block each other. F and H can't happen because synchronized
static methods in the same class block each other, regardless of which instance was used
        to call the methods. (An instance is not required to call static methods; only the class.)
         C could happen because synchronized instance methods called on different instances
 do not block each other. B, D, E, and G could all happen because instance methods and
static methods lock on different objects, and do not block each other. (Objective 4.3)*/

/*Which of the following pairs of method invocations could NEVER be executing at the same time?
        (Choose all that apply.)
 + A. x.a() in thread1, and x.a() in thread2
 B. x.a() in thread1, and x.b() in thread2
 C. x.a() in thread1, and y.a() in thread2
 D. x.a() in thread1, and y.b() in thread2
 E. x.b() in thread1, and x.a() in thread2
 + F. x.b() in thread1, and x.b() in thread2
 G. x.b() in thread1, and y.a() in thread2
 + H. x.b() in thread1, and y.b() in thread2
 */
