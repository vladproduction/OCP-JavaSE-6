package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.locating_data_via_pattern_matching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {

        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        System.out.println("Pattern is " + m.pattern());
        while(m.find()) {
            System.out.println(m.start() + " " + m.group() + " " + m.end());
        }
        /*Pattern is a?
            0 a 1
            1  1
            2 a 3
            3  3*/

    }
}
