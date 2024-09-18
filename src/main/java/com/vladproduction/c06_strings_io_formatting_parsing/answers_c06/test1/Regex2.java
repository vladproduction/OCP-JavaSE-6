package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        boolean b = false;
        while(b = m.find()) {
            System.out.print(m.start() + m.group());
        }

        // args[0]: "\d*"
        // args[1]: ab34ef

        //output: 01234456
        //answer: E

        /*Answer:
  ✓ E is correct. The \d is looking for digits. The * is a quantifier that looks for 0 to many
        occurrences of the pattern that precedes it. Because we specified *, the group() method
        returns empty Strings until consecutive digits are found, so the only time group() returns
        a value is when it returns 34 when the matcher finds digits starting in position 2. The
        start() method returns the starting position of the previous match because, again,
        we said find 0 to many occurrences.
  A, B, C, D, F, and G are incorrect based on the above. (Objective 3.5)*/

    }
}
