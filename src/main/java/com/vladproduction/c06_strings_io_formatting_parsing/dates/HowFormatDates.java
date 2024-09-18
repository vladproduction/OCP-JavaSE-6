package com.vladproduction.c06_strings_io_formatting_parsing.dates;

import java.text.DateFormat;
import java.util.Date;

public class HowFormatDates {
    public static void main(String[] args) {

        Date d1 = new Date(1000000000000L); //trillion

        DateFormat[] df = new DateFormat[6];
        df[0] = DateFormat.getDateInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateInstance(DateFormat.SHORT);
        df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        df[4] = DateFormat.getDateInstance(DateFormat.LONG);
        df[5] = DateFormat.getDateInstance(DateFormat.FULL);
        int count = 0;
        for (DateFormat df_elem : df) {
            System.out.println(count + " " + df_elem.format(d1));
            count++;
        }

        //here is two factory methods, getInstance() and getDateInstance() in action
        //getDateInstance() is overloaded





    }
}
