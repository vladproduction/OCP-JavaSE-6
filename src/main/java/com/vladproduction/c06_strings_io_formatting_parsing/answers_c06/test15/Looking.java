package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test15;

import java.util.Scanner;

public class Looking {
    public static void main(String[] args) {
        String input = "1 2 a 3 45 6";
        Scanner sc = new Scanner(input);
        int x = 0;
        do {
            x = sc.nextInt();
            System.out.print(x + " ");
        } while (x != 0);

        //1 2 and Exception throw: InputMismatchException
        //answer: F

                /*Answer:
          ✓ F is correct. The nextXxx() methods are typically invoked after a call to a hasNextXxx(),
                        which determines whether the next token is of the correct type.
          A, B, C, D, and E are incorrect based on the above. (Objective 3.5)*/
    }
}
