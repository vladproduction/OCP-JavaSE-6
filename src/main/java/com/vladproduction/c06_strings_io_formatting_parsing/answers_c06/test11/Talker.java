package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test11;

import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class Talker {
    public static void main(String[] args) {
        consolePrompt();
//        scannerPrompt();

        //console works fine
        //but answer is D: compilation fails
        //because: c.readPassword("%s", "password: ") return char[], and source code promoted to assign it for String pw variable;

                /*Answer:
          ✓ D is correct. The readPassword() method returns a char[]. If a char[] were used,
                        answer B would be correct.
          A, B, C, and E are incorrect based on the above. (Objective 3.2)*/
    }

    private static void consolePrompt() {
        Console c = System.console();

        // Read username
        String u = c.readLine("%s", "username: ");
        System.out.println("hello " + u);

        char[] pw;
        char[] printedPassword = c.readPassword("%s", "password: ");
        if (c != null && (pw = printedPassword) != null) {
            System.out.println("printed: " + Arrays.toString(pw));
            // Check for valid password
            char [] actualPassword = new char[5]; // actual password
            actualPassword[0] = '1';
            actualPassword[1] = '2';
            actualPassword[2] = '3';
            actualPassword[3] = '4';
            actualPassword[4] = 'f';
            System.out.println("expected: " + Arrays.toString(actualPassword));

            //check if array of chars are equals:
            if (Arrays.equals(pw, actualPassword)) {
                System.out.println("Access granted.");
            } else {
                System.out.println("Access denied.");
            }
        } else {
            System.out.println("No console available. Unable to read password.");
        }
    }

    static void scannerPrompt(){
        Scanner scanner = new Scanner(System.in);

        // Prompt for username
        System.out.print("username: ");
        String u = scanner.nextLine();
        System.out.println("hello " + u);

        // Prompt for password
        System.out.print("password: ");
        String pw = scanner.nextLine(); // Read the password (input will be visible)

        // Check for valid password (simple example)
        // Here you can implement your password validation logic
        if ("1234".equals(pw)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }

        // Close the scanner
        scanner.close();
    }
}
