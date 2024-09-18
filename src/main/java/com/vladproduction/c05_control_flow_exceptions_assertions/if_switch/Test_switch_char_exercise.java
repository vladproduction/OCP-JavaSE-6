package com.vladproduction.c05_control_flow_exceptions_assertions.if_switch;

public class Test_switch_char_exercise {
    public static void main(String[] args) {

        /*Try creating a switch statement using a char value as the case. Include a default
        behavior if none of the char values match.
        *Make sure a char variable is declared before the switch statement.
        *Each case statement should be followed by a break.
        *The default case can be located at the end, middle, or top.*/

        System.out.println("----demo----");
        //#demo:
        char inputChar = 'b'; // Hardcoded character for demonstration

        switch (inputChar) {
            case 'a':
                System.out.println("You entered character 'a'.");
                break;
            case 'b':
                System.out.println("You entered character 'b'.");
                break;
            case 'c':
                System.out.println("You entered character 'c'.");
                break;
            case 'd':
                System.out.println("You entered character 'd'.");
                break;
            default:
                System.out.println("Unknown character entered.");
                break;
        }

        System.out.println("----#1----");
        //#1
        char symbol = 'a';
        char [] chars = {'a', 'b', 'c', 'd', 'e'};
        for (char item : chars) {
            if(item == symbol){
                switch (symbol){
                    case 'a' -> System.out.println("a");
                    case 'b' -> System.out.println("b");
                    case 'c' -> System.out.println("c");
                    case 'd' -> System.out.println("d");
                    case 'e' -> System.out.println("e");
                    default -> System.out.println("no match");
                }
            }
        }
        System.out.println("executed");

        System.out.println("----#2----");
        //#2
        char character = 'g'; // Character to match
        char[] characters_arr = {'a', 'b', 'c', 'd', 'e', 'g'};
        boolean foundMatch = false; // Flag to track if a match was found

        for (char item : characters_arr) {
            if (item == character) {
                foundMatch = true; // A match has been found
                break; // Exit the loop as we found a match
            }
        }
        // Switch statement outside of the loop
        System.out.println("start switch");
        switch (character) {
            case 'a' -> System.out.println("a");
            case 'b' -> System.out.println("b");
            case 'c' -> System.out.println("c");
            case 'd' -> System.out.println("d");
            case 'e' -> System.out.println("e");
            case 'f' -> System.out.println("f");
            default -> {
                if (!foundMatch) {
                    System.out.println("No match found.");
                } else {
                    System.out.println("Matched but no specific case for: " + character);
                }
            }
        }
        System.out.println("finish switch");

        System.out.println("----#3----");
        //#3
        char[] inputChars = {'a', 'b', 'd', 'e', 'c'}; // Array of characters

        for (char element : inputChars) {
            switch (element) {
                case 'a':
                    System.out.println("You entered character 'a'.");
                    break;
                case 'b':
                    System.out.println("You entered character 'b'.");
                    break;
                case 'c':
                    System.out.println("You entered character 'c'.");
                    break;
                case 'd':
                    System.out.println("You entered character 'd'.");
                    break;
                default:
                    System.out.println("Unknown character entered: " + element);
                    break;
            }
        }


    }
}
