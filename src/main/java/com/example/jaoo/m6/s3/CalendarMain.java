/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s3;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * java util Calendar
 */
public class CalendarMain {
    /**
     * Create dates by calendar
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("A date in January from calendar (all time info): "
                + new GregorianCalendar(2023, Calendar.JANUARY, 30, 12, 59, 30).getTime());
        System.out.println("A date in September from calendar (no time -> midnight): "
                + new GregorianCalendar(2023, Calendar.JANUARY, 30).getTime());

        Calendar now = new GregorianCalendar();
        System.out.println("Date from calendar (default = now): " + now.getTime());

        System.out.printf("Today: %d-%02d-%d %n", //
                now.get(Calendar.DAY_OF_MONTH), now.get(Calendar.MONTH) + 1, now.get(Calendar.YEAR));
    }
}
