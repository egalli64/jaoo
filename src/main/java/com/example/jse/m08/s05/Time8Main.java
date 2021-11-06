package com.example.jse.m08.s05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Time8Main {
    public static void main(String[] args) {
        // data factories
        System.out.println("A date (of /1): " +
                LocalDate.of(2021, Month.SEPTEMBER, 30));
        System.out.println("A date (of /2): " +
                LocalDate.of(2021, 9, 30));
        System.out.println("A date (parse): " +
                LocalDate.parse("2021-09-30"));
        LocalDate today = LocalDate.now();
        System.out.println("Current date (now): " + today);

        // data getter
        System.out.printf("Current date (getter /1): %d %d %d%n",
                today.getDayOfMonth(), today.getMonthValue(), today.getYear());
        System.out.printf("Current date (getter /2): %d %d %d%n",
                today.get(ChronoField.DAY_OF_MONTH), today.get(ChronoField.MONTH_OF_YEAR), today.get(ChronoField.YEAR));

        // date with
        System.out.println("Tomorrow (with): " +
                today.with(ChronoField.DAY_OF_MONTH, today.getDayOfMonth() + 1));
        System.out.println("Same day, next year (with): " +
                today.withYear(today.getYear() + 1));

        // date plus / minus
        System.out.println("Tomorrow (plus): " +
                today.plus(1, ChronoUnit.DAYS));
        System.out.println("Same day, last year (minus): " +
                today.minus(1, ChronoUnit.YEARS));

        // time factories
        System.out.println("A time (of): " +
                LocalTime.of(11, 15, 24));
        System.out.println("A time (parse): " +
                LocalTime.parse("11:15:24"));
        LocalTime now = LocalTime.now();
        System.out.println("Current time (now): " + now.toString());

        // time getters
        System.out.printf("Current time (getter /1): %d %d %d%n",
                now.getHour(), now.getMinute(), now.getSecond());
        System.out.printf("Current time (getter /2): %d %d %d%n",
                now.get(ChronoField.HOUR_OF_DAY), now.get(ChronoField.MINUTE_OF_HOUR), now.get(ChronoField.SECOND_OF_MINUTE));

        // date-time factories
        System.out.println("Date time (now): " + LocalDateTime.now());
        LocalDateTime dateTime = LocalDateTime.of(today, now);
        System.out.println("Date time (by aggregation): " + dateTime);
        System.out.printf("Current date time (getter): %d %d %d - %d %d %d%n",
                today.getDayOfMonth(), today.getMonthValue(), today.getYear(),
                dateTime.getHour(), dateTime.getMinute(), dateTime.getSecond());

        // date-time getters
        System.out.println("Date extracted from date-time: " +
                dateTime.toLocalDate());

        System.out.println("Time extracted from date-time: " +
                dateTime.toLocalTime());
    }
}
