package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Let's say that our job this time is to search a text file and find anything that might be a local,
 * 7-digit phone number. We're going to say, arbitrarily, that if we find either seven
 * digits in a row, or three digits followed by a dash or a space followed by 4 digits, that
 * we have a candidate. Here are examples of "valid" phone numbers:
 * 1234567
 * 123 4567
 * 123-4567
 * */
public class UsingSearchingZeroOrOneOccurrences {
    public static void main(String[] args) {

        /*The key to creating this expression is to see that we need "zero or one instance of
        either a space or a dash" in the middle of our digits:
        pattern: \d\d\d([-\s])?\d\d\d\d*/

                /*Breakdown of the Pattern:
                    1)  \d\d\d: Matches the first three digits.
                    2)  ([-\s])?: Matches zero or one instance (?) of either a dash (-) or a space (\s).
                    3)  \d\d\d\d: Match the last four digits.*/

        String filePath = "phone_numbers.txt"; // Path to the text file containing phone numbers
        String regex = "\\d{7}|\\d{3}([-\\s])?\\d{4}"; // The regex pattern to find the phone numbers

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Matching phone numbers found:");
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        /*Matching phone numbers found:
        1234567
        123 4567
        123-4567
        9876543
        444-5555
        555-5555*/


    }
}
