package com.vladproduction.c06_strings_io_formatting_parsing.dates;

import java.util.Date;

public class TestDates {
    public static void main(String[] args) {

        Date d1 = new Date(1000000000000L); // a trillion!
        System.out.println("1st date " + d1.toString());

        //try to add 1h
        d1.setTime(d1.getTime() + 3600000); // 3600000 millis / hour
        System.out.println("new time " + d1.toString());

        //date represent now:
        Date now = new Date();
        System.out.println("now = " + now);

    }
}
