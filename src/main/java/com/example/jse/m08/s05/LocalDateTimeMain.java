package com.example.jse.m08.s05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
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
