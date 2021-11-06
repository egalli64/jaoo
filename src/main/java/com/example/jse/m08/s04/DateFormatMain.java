package com.example.jse.m08.s04;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatMain {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateInstance();
        Date now = new Date();

        System.out.println("Current date to string: " + now);

        System.out.println("Full style for date in Japan locale: " +
                DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPAN).format(now));

        System.out.println("Full style for time in Japan locale: " +
                DateFormat.getTimeInstance(DateFormat.FULL, Locale.JAPAN).format(now));

        System.out.println("Full style for both date and time in Japan locale: " +
                DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.JAPAN).format(now));

        System.out.println("Full style for date in US locale: " +
                DateFormat.getDateInstance(DateFormat.FULL, Locale.US).format(now));

        System.out.println("Full style for time in US locale: " +
                DateFormat.getTimeInstance(DateFormat.FULL, Locale.US).format(now));

        System.out.println("Full style for both date and time in US locale: " +
                DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.US).format(now));

        System.out.println("Using DateFormat styles FULL, LONG, MEDIUM, SHORT for date and time in the current local");
        for (int style = DateFormat.FULL; style <= DateFormat.SHORT; style++) {
            System.out.print(DateFormat.getDateInstance(style).format(now) + " - ");
            System.out.println(DateFormat.getTimeInstance(style).format(now));
        }

        System.out.println("Using default style (MEDIUM) and local: " + df.format(now));
    }
}
