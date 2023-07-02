/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s5;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * java time LocalDate
 */
public class LocalDateMain {
    /**
     * Basic LocalDate functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // data factories
        System.out.printf("A date (by 'of' /1): %s%n", LocalDate.of(2023, Month.JANUARY, 30));
        System.out.printf("A date (by 'of' /2): %s%n", LocalDate.of(2023, 1, 30));
        System.out.printf("A date (by 'parse'): %s%n", LocalDate.parse("2023-01-30"));

        LocalDate today = LocalDate.now();
        System.out.printf("Current date (now): %s%n", today);

        // data getter
        System.out.printf("Current date (getter /1): %02d %02d %d%n", today.getDayOfMonth(), today.getMonthValue(),
                today.getYear());
        System.out.printf("Current date (getter /2): %02d %02d %d%n", today.get(ChronoField.DAY_OF_MONTH),
                today.get(ChronoField.MONTH_OF_YEAR), today.get(ChronoField.YEAR));

        // date with
        System.out.printf("Tomorrow (with): %s%n", today.with(ChronoField.DAY_OF_MONTH, today.getDayOfMonth() + 1));
        System.out.printf("Same day, next year (with): %s%n", today.withYear(today.getYear() + 1));

        // date plus / minus
        System.out.printf("Tomorrow (plus): %s%n", today.plus(1, ChronoUnit.DAYS));
        System.out.printf("Same day, last year (minus): %s%n", today.minus(1, ChronoUnit.YEARS));
    }
}
