package com.vladproduction.c05_control_flow_exceptions_assertions.handling_exceptions.exercise;

public class MyException {
    public static void main(String[] args) {
        // Ensure a command-line argument is passed
        if (args.length == 0) {
            System.out.println("Please provide a food item as a command-line argument.");
            return; // Exit if no argument is provided
        }
        // Get the food item from command-line arguments
        String food = args[0];
        try {
            // Check the food using checkFood() method
            checkFood(food);
        } catch (BadFoodException e) {
            // Handle the exception for disliked food
            System.out.println("Exception: " + e.getMessage());
        }
        // Indicate that the main method has finished
        System.out.println("Main method has finished.");

    }

    // Method to check if food is liked
    static void checkFood(String food) throws BadFoodException{
        // List of foods not liked
        String [] dislikeFoodList = {"food-3", "food-3", "food-3"};
        for (String dislikedFood : dislikeFoodList) {
            // Check if the given food is in the list of disliked foods
            if(food.equalsIgnoreCase(dislikedFood)){
                throw new BadFoodException(dislikedFood + " is not acceptable.");
            }
        }
        // If not disliked (my choice):
        System.out.println("I like " + food + "!");
    }

}


