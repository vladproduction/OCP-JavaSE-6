package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSmall2 {
    public static void main(String[] args) {
        /*source: abababa
        index: 0123456
        expression: aba*/

        Pattern p = Pattern.compile("aba");
        Matcher m = p.matcher("abababa");
        while (m.find()){
            System.out.print(m.start() + " ");
        }
        //how many accuracies matched here?
        //0 4
        /*In general, a regex search runs from left to right, and once a source's character has
        been used in a match, it cannot be reused.*/

    }
}
