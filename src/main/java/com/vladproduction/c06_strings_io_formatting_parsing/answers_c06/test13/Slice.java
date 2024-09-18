package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test13;

import java.text.NumberFormat;

public class Slice {
    public static void main(String[] args) {
        /*Which are true? (Choose all that apply.)
        -A. The output is 987.12345 987.12345
        -B. The output is 987.12346 987.12345
        -C. The output is 987.12345 987.123456
        +D. The output is 987.12346 987.123456
        -E. The try/catch block is unnecessary
        +F. The code compiles and runs without exception
        +G. The invocation of parse() must be placed within a try/catch block*/

        versionA();

        versionC();

            /*Answer:
      ✓ D, F, and G are correct. The setMaximumFractionDigits() applies to the formatting
            but not the parsing. The try/catch block is placed appropriately. This one might scare you
            into thinking that you'll need to memorize more than you really do. If you can remember
            that you're formatting the number and parsing the string you should be fine for the exam.
      A, B, C, and E are incorrect based on the above. (Objective 3.4)*/

    }

    private static void versionC() {
        //source code from the task:
        //why 987.12346 --> d but not 987.12345  ???
        //the last occurs digit rounded to the next sequence if bigger or equal '5'
        //for example:

        double d = 987.127456d;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(d) + " "); //expected: 987.13


    }

    private static void versionB(){
        //source code from the task:
        //no try/catch has to be
        // (parse() throws exception)
        String s = "987.123456";
        double d = 987.123456d;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(d) + " ");
//        System.out.println(nf.parse(s));
//        try {
//
//        } catch (Exception e) {
//            System.out.println("got exc");
//        }

    }

    private static void versionA() {
        //source code from the task:
        String s = "987.123456";
        double d = 987.123456d;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(d) + " ");
        try {
            System.out.println(nf.parse(s));
        } catch (Exception e) {
            System.out.println("got exc");
        }

        //987.12346 --> d
        //987.123456 --> s
    }
}
