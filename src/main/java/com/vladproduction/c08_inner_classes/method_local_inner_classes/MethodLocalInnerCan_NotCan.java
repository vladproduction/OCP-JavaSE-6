package com.vladproduction.c08_inner_classes.method_local_inner_classes;

public class MethodLocalInnerCan_NotCan {
    private String x = "Outer class variable 'x'";

    public static void main(String[] args) {
        MethodLocalInnerCan_NotCan localVarInvoker = new MethodLocalInnerCan_NotCan();
        localVarInvoker.doStuff();
    }

    public void doStuff(){
        //#1 non-marked
        String not_final = "Local variable not final"; //must be effectively final
        //#2 marked as final
        final String finalVar = "Local variable as final";
        class InnerClass{
            void seeOuter(){
                System.out.println(x);
                System.out.println(not_final);
                System.out.println(finalVar);
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.seeOuter();
    }
}
//points:
/*1) method-local inner class can be instantiated only within the method where the inner class is defined*/
/*2) Starting from Java 8, local variables referenced from inside a method-local inner class do not actually have to be
explicitly declared as final but must be effectively final. This means that once a local variable is assigned a value,
it cannot change later before its use in the inner class.
In this case, you never change the not_final variable after its initialization.*/


