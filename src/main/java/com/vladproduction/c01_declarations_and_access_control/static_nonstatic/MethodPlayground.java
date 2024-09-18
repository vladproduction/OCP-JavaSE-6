package com.vladproduction.c01_declarations_and_access_control.static_nonstatic;

/**
 * Develop code that declares both static and non-static methods, and—if appropriate—
 * use method names that adhere to the JavaBeans naming standards. Also develop code that
 * declares and uses a variable-length argument list.
 * */
public class MethodPlayground {
    public static void main(String[] args) {

        System.out.println(sayHello("John")); //invoke static method

        MethodPlayground methodPlayground = new MethodPlayground();
        System.out.println(methodPlayground.calculateArea(5)); //invoke non-static method

        methodPlayground.printFruits("Apple,", "Apricot,", "Banana;");

    }

    //static
    public static String sayHello(String name){
        return  "Hello, " +  name + " !";
    }

    //non-static
    public double calculateArea(double r){
        return Math.PI * (r*r);
    }

    // Method with variable-length argument list
    public void printFruits(String... fruits){
        System.out.print("List of fruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

}
