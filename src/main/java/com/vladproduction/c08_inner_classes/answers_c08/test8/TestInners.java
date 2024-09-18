package com.vladproduction.c08_inner_classes.answers_c08.test8;

public class TestInners {
    public static void main(String[] args) {
        //instance of TestInners is created, and its go() method is called.
        new TestInners().go(); //middle

    }

    //An inner class A within the go() method.
    void go() {
        new A().m();//refers to the inner class A, which is defined after the line that instantiates it.
                    // In Java, inner and local classes can be instantiated as long as they are defined in the same context or scope.
                    // Since the inner class A has been defined, it is ready to be used here.
        //inner class A prints "inner".
        // However, the instantiation happens inside the go() method, which logically, along with scope resolution, applies.
        class A {
            void m() {
                System.out.println("inner");
            }
        }
    }
    //A member class A in the TestInners (outer class) class
    //At the time the call to m() is executed, the method m() from the outer member class A takes precedence in this class context.
    // The member class A contains a method m() defined to print "middle".
    class A {
        void m() {
            System.out.println("middle");
        }
    }

}

//standalone class A, which is outside the TestInners.
class A {
    void m() {
        System.out.println("outer");
    }
}

/*What is the result?
A. inner
B. outer
+C. middle
D. Compilation fails
E. An exception is thrown at runtime*/

/*Answer:
        ✓ C is correct. The "inner" version of class A isn't used because its declaration comes
after the instance of class A is created in the go() method.
  A, B, D, and E are incorrect based on the above. (Objective 1.1)*/
