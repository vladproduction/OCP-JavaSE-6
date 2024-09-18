package com.vladproduction.c06_strings_io_formatting_parsing.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * parse() method takes a String formatted in the style of the DateFormat instance
 * being used, and converts the String into a Date object
 * */
public class ParseDateToStringAndViseVersa {
    public static void main(String[] args) {
        Date d1 = new Date(1000000000000L);
        System.out.println("d1 = " + d1);

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        String s = df.format(d1);
        System.out.println(s);
        try {
            Date d2 = df.parse(s);
            System.out.println("parsed = " + d2.toString());
        } catch (ParseException pe) {
            System.out.println("parse exc"); }
    }
}
