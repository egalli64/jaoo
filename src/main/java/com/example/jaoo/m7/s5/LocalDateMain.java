/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s5;

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
        System.out.printf("LocalDate.of() /1: %s\n", LocalDate.of(2024, Month.JANUARY, 30));
        System.out.printf("LocalDate.of() /2: %s\n", LocalDate.of(2024, 1, 30));
        System.out.printf("LocalDate.parse(): %s\n", LocalDate.parse("2024-01-30"));

        LocalDate today = LocalDate.now();
        System.out.printf("LocalDate.now(): %s\n", today);

        // data getter
        System.out.printf("Using specific getters: %02d %02d %d\n", today.getDayOfMonth(), today.getMonthValue(),
                today.getYear());
        System.out.printf("Using getter w/ argument: %02d %02d %d\n", today.get(ChronoField.DAY_OF_MONTH),
                today.get(ChronoField.MONTH_OF_YEAR), today.get(ChronoField.YEAR));

        // date with
        System.out.printf("New date by with(): %s\n", today.with(ChronoField.DAY_OF_MONTH, today.getDayOfMonth() + 1));
        System.out.printf("New date by withYear(): %s\n", today.withYear(today.getYear() + 1));

        // date plus / minus
        System.out.printf("New date by plus(): %s\n", today.plus(1, ChronoUnit.DAYS));
        System.out.printf("New date by minus(): %s\n", today.minus(1, ChronoUnit.YEARS));
    }
}
