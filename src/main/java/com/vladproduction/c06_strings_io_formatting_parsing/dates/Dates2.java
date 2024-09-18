package com.vladproduction.c06_strings_io_formatting_parsing.dates;

import java.util.Calendar;
import java.util.Date;

/**
 * find out what day of the week our trillionth millisecond falls on, and
 * then let's add a month to that date:
 * */
public class Dates2 {
    public static void main(String[] args) {
        Date d1 = new Date(1000000000000L);
        System.out.println("1st date " + d1.toString());
        Calendar c = Calendar.getInstance();
        c.setTime(d1); // #1
        if(Calendar.MONDAY == c.getFirstDayOfWeek()) // #2
            System.out.println("Monday is the first day of the week");
        System.out.println("trillionth milli day of week is " + c.get(Calendar.DAY_OF_WEEK)); // #3
        c.add(Calendar.MONTH, 1); // #4
        Date d2 = c.getTime(); // #5
        System.out.println("new date " + d2);

        //add() very powerful: (so, we can)
        c.add(Calendar.HOUR, -4); // subtract 4 hours from c's value
        c.add(Calendar.YEAR, 2); // add 2 years to c's value
        c.add(Calendar.DAY_OF_WEEK, -2); // subtract two days from c's value

        //roll() method
        /*roll() method acts like the add() method, except that when a part
        of a Date gets incremented or decremented, larger parts of the Date will not get
        incremented or decremented.*/
        /*invoking roll() with HOUR won't change the date, the month, or the year.*/

        // assume c is October 7, 2003
        Date dd4 = c.getTime();
        System.out.println("before roll: " + dd4);
        c.roll(Calendar.MONTH, 9); // notice the year in the output
        Date d4 = c.getTime();
        System.out.println("after roll: " + d4);

    }
}
