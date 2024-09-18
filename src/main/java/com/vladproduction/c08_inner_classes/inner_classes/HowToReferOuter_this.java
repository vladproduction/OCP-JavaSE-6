package com.vladproduction.c08_inner_classes.inner_classes;

public class HowToReferOuter_this {
    public static void main(String[] args) {
        OuterA.InnerA inner  = new OuterA().new InnerA();
        inner.seeOuterA(); //access to "outer this"

            /*  rules for an inner class referencing itself or the outer instance are as follows:
                ■ To reference the inner class instance itself, from within the inner class code,
                use this.
                ■ To reference the "outer this" (the outer class instance) from within the inner
                class code, use NameOfOuterClass.this (example, MyOuter.this).  */

            /*modifiers can be applied to an inner class:
                ■ final
                ■ abstract
                ■ public
                ■ private
                ■ protected
                ■ static—but static turns it into a static nested class not an inner class
                ■ strictfp*/

        System.out.println("■"); //just symbol))

    }
}

class OuterA{

    private int x = 8;
    public void makeInner(){
        InnerA innerA = new InnerA();
        innerA.seeOuterA();
    }
    class InnerA{
        public void seeOuterA(){
            System.out.println("Outer x is " + x);
            System.out.println("Inner class ref is " + this);
            System.out.println("Outer class ref is " + OuterA.this);
        }
    }

}
