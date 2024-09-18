package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;

public class Metacharacters_and_StringsCollide {
    public static void main(String[] args) {

        /*first backslash tells the compiler that whatever comes next should be taken
        literally, not as an escape sequence*/
        String digit = "\\d";

        String p1 = "."; // regex sees this as the "." metacharacter
//        String p2 = "\."; // the compiler sees this as an illegal Java escape sequence
        String p3 = "\\."; // the compiler is happy, and regex sees a dot, not a metacharacter

        /*The Java language defines several escape sequences, including
            \n = linefeed (which you might see on the exam)
            \b = backspace
            \t = tab*/

    }
}
