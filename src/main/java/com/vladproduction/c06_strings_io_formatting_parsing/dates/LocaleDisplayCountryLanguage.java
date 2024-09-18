package com.vladproduction.c06_strings_io_formatting_parsing.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * create Strings that represent a given locale's country and language in terms of
 * both the default locale and any other locale:
 * */
public class LocaleDisplayCountryLanguage {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2010, 11, 14);
        Date d2 = c.getTime();
        Locale locBR = new Locale("pt", "BR"); // Brazil
        Locale locDK = new Locale("da", "DK"); // Denmark
        Locale locIT = new Locale("it", "IT"); // Italy
        System.out.println("def " + locBR.getDisplayCountry());
        System.out.println("loc " + locBR.getDisplayCountry(locBR));
        System.out.println("def " + locDK.getDisplayLanguage());
        System.out.println("loc " + locDK.getDisplayLanguage(locDK));
        System.out.println("D>I " + locDK.getDisplayLanguage(locIT));

        /*def Brazil
        loc Brasil
        def Danish
        loc dansk
        D>I danese*/

        /*Given that our JVM's locale (the default for us) is US, the default for the
        country Brazil is "Brazil", and the default for the Danish language is "Danish".
                In Brazil, the country is called "Brasil", and in Denmark the language is called
        "dansk". Finally, just for fun, we discovered that in Italy, the Danish language is
        called "danese".*/
    }
}
