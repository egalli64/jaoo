/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * java time LocalDateTime
 */
public class LocalDateTimeMain {
    /**
     * Basic LocalDateTime functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // date-time factories
        System.out.println("Date time (now): " + LocalDateTime.now());
        LocalDateTime now = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.printf("Date time (by aggregation): %s%n", now);
        System.out.printf("Current date time (getter): %02d %02d %d - %02d %02d %d%n", now.getDayOfMonth(),
                now.getMonthValue(), now.getYear(), now.getHour(), now.getMinute(), now.getSecond());

        // date-time getters
        System.out.printf("Date extracted from date-time: %s%n", now.toLocalDate());

        System.out.printf("Time extracted from date-time: %s%n", now.toLocalTime());
    }
}
