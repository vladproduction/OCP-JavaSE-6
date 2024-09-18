package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchingInRange {
    public static void main(String[] args) {

        //#1[abc] Searches only for a's, b's or c's
        Pattern p = Pattern.compile("[abc]");
        Matcher m = p.matcher("a12c3e456f");
        while (m.find()){
            System.out.print(m.start() + "; ");
        }
        //0; 3

        //#2[a-f] Searches only for a, b, c, d, e, or f characters
        System.out.println();
        p = Pattern.compile("[a-f]");
        m = p.matcher("a12c3e456f");
        while (m.find()){
            System.out.print(m.start() + "; ");
        }
        //0 3 5 9

        //#3[a-fA-F] Searches for the first six letters of the alphabet, both cases.
        /*source: "cafeBABE"
        index: 01234567
        pattern: [a-cA-C]
        returns positions 0, 1, 4, 5, 6.*/
        System.out.println();
        p = Pattern.compile("[a-cA-C]");
        m = p.matcher("cafeBABE");
        while (m.find()){
            System.out.print(m.start() + "; ");
        }
        //0, 1, 4, 5, 6

        /*can also apply
        the following attributes to sets and ranges within square brackets: "^" to
        negate the characters specified, nested brackets to create a union of sets,
        and "&&" to specify the intersection of sets*/
    }
}
