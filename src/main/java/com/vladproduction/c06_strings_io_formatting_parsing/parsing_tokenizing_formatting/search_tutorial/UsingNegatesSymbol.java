package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The given regex pattern: proj1([^,])*
 * is designed to match strings that start with proj1 and can be followed by any characters except for a comma (,).
 * The ([^,])* part ensures that we can have zero or more occurrences of characters that are not a comma.
 * */
public class UsingNegatesSymbol {
    public static void main(String[] args) {

        // Sample input string containing filenames:
        String input = "proj1_report.txt, proj2_data.csv, proj1_image.png, proj1_summary.pdf, otherfile.doc";

        // Regular expression to match filenames that start with proj1
        String regex = "proj1([^,])*";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Find and print all matches
        System.out.println("Files starting with 'proj1':");
        while (matcher.find()) {
            System.out.println(matcher.group().trim());
        }

        /*Files starting with 'proj1':
        proj1_report.txt
        proj1_image.png
        proj1_summary.pdf*/

        //conclusion:
        /*The regex proj1([^,])* allows for matching any filename starting with proj1
        and followed by any characters except for a comma, effectively isolating valid filenames.*/

    }
}
