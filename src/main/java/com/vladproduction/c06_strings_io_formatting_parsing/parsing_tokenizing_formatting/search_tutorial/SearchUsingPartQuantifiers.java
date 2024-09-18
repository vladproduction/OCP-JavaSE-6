package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchUsingPartQuantifiers {
    public static void main(String[] args) {
        /*how to specify the use of a quantifier for only part of an expression.
        In this case we must have exactly one occurrence of 0x or 0X but we can have from
        one to many occurrences of the hex "digits" that follow. The following expression
        adds parentheses to limit the "+" quantifier to only the hex digits:
        0[xX]([0-9a-fA-F])+*/
        // Sample input string containing hexadecimal numbers
        String input = "Here are some hexadecimal numbers: 0x1A3F, 0X12AF, and invalid ones: 12G, 0x, 0XABCDXYZ.";

        // Regular expression to match hexadecimal numbers
        String regex = "0[xX]([0-9a-fA-F])+";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Find and print all matches
        System.out.println("Hexadecimal numbers found:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        /*Hexadecimal numbers found:
        0x1A3F
        0X12AF
        0XABC*/


    }
}
