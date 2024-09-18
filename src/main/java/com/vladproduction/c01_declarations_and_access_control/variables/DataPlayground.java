package com.vladproduction.c01_declarations_and_access_control.variables;


/**
 * Develop code that declares, initializes, and uses primitives, arrays, enums, and
 * objects as static, instance, and local variables. Also, use legal identifiers for variable names.
 */

public class DataPlayground {

    //main method
    public static void main(String[] args) {

        //init class instance
        DataPlayground dataPlayground = new DataPlayground("Java", 5);
        dataPlayground.printInfo(); //invoke method with logic

    }

    public static final double PI = 3.14; // Static final primitive (constant)

    private String name; // Instance variable (object reference)
    private int [] numbers; // Instance variable (array reference)
    private DayOfWeek favoriteDay; // Instance variable (enum reference)


    //constructor with params
    public DataPlayground(String name, int size){
        this.name = name;
        this.numbers = new int[size]; // Instance variable initialized in constructor
        favoriteDay = DayOfWeek.FRIDAY; // Instance variable assigned an enum value
    }

    //method (logic is grounded here)
    public void printInfo(){
        int age = 25; //local primitive variable
        String [] hobbies = {"Coding", "Reading"}; //local array variable

        System.out.println("Name: " + name);
        System.out.println("Favorite Day: " + favoriteDay);

        //working with class variable
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10; // Assigning values to instance variable (array)
        }
        System.out.println("\nNumbers: ");
        for (int num: numbers) {
            System.out.println(num + " ");
        }

        //working with local variable
        System.out.println("\nHobbies: ");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }
        System.out.println("Age (local): " + age);  // Accessing local variable
    }

    //declaring enum class
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
