package com.vladproduction.c06_strings_io_formatting_parsing.numbers_currencies;


import java.text.NumberFormat;
import java.text.ParseException;

/**
 * a little code that uses getMaximumFractionDigits(),
 * setMaximumFractionDigits(), parse(), and setParseIntegerOnly():
 * */
public class NumberFormatFractionalDigits {
    public static void main(String[] args) {

        float f1 = 123.45678f;
        NumberFormat nf = NumberFormat.getInstance();
        System.out.print(nf.getMaximumFractionDigits() + " ");
        System.out.print(nf.format(f1) + " ");
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(f1) + " ");
        try {
            System.out.println(nf.parse("1234.567"));
            nf.setParseIntegerOnly(true);
            System.out.println(nf.parse("1234.567"));
        } catch (ParseException pe) {
            System.out.println("parse exc");
        }

    }
}
