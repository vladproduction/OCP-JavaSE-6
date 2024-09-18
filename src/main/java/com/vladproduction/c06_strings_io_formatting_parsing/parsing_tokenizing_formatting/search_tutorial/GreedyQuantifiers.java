package com.vladproduction.c06_strings_io_formatting_parsing.parsing_tokenizing_formatting.search_tutorial;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedyQuantifiers {

    public static final String GREEDY_QUANTIFIER = ".*xx";
    public static final String RELUCTANT_QUANTIFIER = ".*?xx";
    public static final String SOURCE = "yyxxxyxx";

    public static void main(String[] args) {

        //#1 pattern: (greedy quantifier *).*xx
        /*output: 0 yyxxxyxx*/
        Pattern p = Pattern.compile(GREEDY_QUANTIFIER);
        Matcher m = p.matcher(SOURCE);
        while (m.find()){
            System.out.println(m.start() + " " + m.group());
        }

        System.out.println("-------------");
        //#2 pattern: (reluctant qualifier) .*?xx
        /*output:   0 yyxx
                    4 xyxx*/
        p = Pattern.compile(RELUCTANT_QUANTIFIER);
        m = p.matcher(SOURCE);
        while (m.find()){
            System.out.println(m.start() + " " + m.group());
        }

    }
}
