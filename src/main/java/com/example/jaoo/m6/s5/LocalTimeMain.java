/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s5;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 * java time LocalTime
 */
public class LocalTimeMain {
    /**
     * Basic LocalTime functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // time factories
        System.out.printf("A time (by 'of'): %s%n", LocalTime.of(11, 15, 24));
        System.out.printf("A time (parse): %s%n", LocalTime.parse("11:15:24"));
        LocalTime now = LocalTime.now();
        System.out.printf("Current time (now): %s%n", now.toString());

        // time getters
        System.out.printf("Current time (getter /1): %02d %02d %02d%n", now.getHour(), now.getMinute(),
                now.getSecond());
        System.out.printf("Current time (getter /2): %02d %02d %02d%n", now.get(ChronoField.HOUR_OF_DAY),
                now.get(ChronoField.MINUTE_OF_HOUR), now.get(ChronoField.SECOND_OF_MINUTE));
    }
}
