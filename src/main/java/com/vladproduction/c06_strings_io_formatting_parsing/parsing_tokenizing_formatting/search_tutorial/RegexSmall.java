package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSmall {
    private static final CharSequence SOURCE_TXT = "abaaaba";

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("ab"); //expression
        Matcher matcher = pattern.matcher(SOURCE_TXT); //source
        while (matcher.find()){
            System.out.print(matcher.start() + " ");
        }
        // 0 4

    }

}
