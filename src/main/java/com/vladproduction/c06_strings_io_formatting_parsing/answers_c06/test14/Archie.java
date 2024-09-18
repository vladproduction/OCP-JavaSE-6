package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Archie {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(args[0]);
        Matcher m = p.matcher(args[1]);
        int count = 0;
        while (m.find()){
            System.out.println(m); //2 4 67
            count++;
        }
        System.out.print(count); //3

//        java Archie "\d+" ab2c4d67

                /*Answer:
          ✓ B is correct. The "\d" metacharacter looks for digits, and the + quantifier says look for
                "one or more" occurrences. The find() method will find three sets of one or more consecutive digits: 2, 4, and 67.
          A, C, D, E, and F are incorrect based on the above. (Objective 3.5)*/
    }
}
