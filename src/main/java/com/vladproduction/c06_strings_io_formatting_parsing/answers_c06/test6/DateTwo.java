package com.vladproduction.c06_strings_io_formatting_parsing.answers_c06.test6;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;


/**
 * Given that 1119280000000L is roughly the number of milliseconds from Jan 1, 1970, to June
 * 20, 2005, and that you want to print that date in German, using the LONG style such that "June"
 * will be displayed as "Juni", complete the code using the fragments below. Note: you can use
 * each fragment either zero or one times, and you might not need to fill all of the slots.
 *
 *  io.*; new DateFormat( Locale.LONG
 *  nio.*; DateFormat.getInstance( Locale.GERMANY
 *  util.*; DateFormat.getDateInstance( DateFormat.LONG
 *  text.*; util.regex; DateFormat.GERMANY
 *  date.*; df.format(d)); d.format(df));
 * */
public class DateTwo {
    public static void main(String[] args) {

        // Create a Date object for June 20, 2005
        Date date = new Date(1119280000000L);

        // Create a DateFormat instance with the LONG style and German locale
        DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMAN);

        // Format the date
        String formatted = df.format(date);

        // Print the formatted date
        System.out.println(formatted); // Output: 20. Juni 2005

        /*Answer:
        import java.util.*;
        import java.text.*;
        class DateTwo {
            public static void main(String[] args) {
                Date d = new Date(1119280000000L);
                DateFormat df = DateFormat.getDateInstance(
                        DateFormat.LONG, Locale.GERMANY);
                System.out.println(df.format(d));
            }
        }
        Notes: Remember that you must build DateFormat objects using static methods. Also
        remember that you must specify a Locale for a DateFormat object at the time of instantiation.
        The getInstance() method does not take a Locale. (Objective 3.4)*/

    }
}
