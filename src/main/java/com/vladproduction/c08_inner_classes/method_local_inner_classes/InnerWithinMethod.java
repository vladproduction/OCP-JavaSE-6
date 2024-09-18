package com.vladproduction.c08_inner_classes.method_local_inner_classes;

public class InnerWithinMethod {
    private String str = "Outer";

    public static void main(String[] args) {
        InnerWithinMethod outer = new InnerWithinMethod();
        outer.doStuff(); //after instantiation inner within method,- response come: "Outer"
    }

    //static is not available for this method (str will not be not possible to access)
    void doStuff(){
        class MyInner{  // it never instantiates the inner class!
            public void seeOuter(){
                System.out.println(str);
            }
        }
        /*to use the inner class you must make an instance
          of it somewhere within the method but below the inner class definition*/
        MyInner inner = new MyInner();
        inner.seeOuter(); //now full flow doStuff() ride
    }
}
