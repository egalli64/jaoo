package com.example.jse.m08.s06;

import java.time.*;
import java.time.temporal.UnsupportedTemporalTypeException;

public class DurationPeriodMain {
    public static void main(String[] args) {
        System.out.println("Duration zero secs between times: " +
                Duration.between(LocalTime.now(), LocalTime.now()));
        System.out.println("Duration zero secs between instants: " +
                Duration.between(Instant.now(), Instant.now()));
        System.out.println("Duration zero days between instants: " +
                Period.between(LocalDate.now(), LocalDate.now()));

        try {
            Duration.between(LocalTime.now(), Instant.now());
        } catch (DateTimeException ex) {
            System.out.println("Do not mix different Temporal!");
        }

        try {
            Duration.between(LocalDate.now(), LocalDate.now());
        } catch (UnsupportedTemporalTypeException ex) {
            System.out.println("Do not use Duration for LocalDate!");
        }

        System.out.println("A duration of 2 days: " + Duration.ofDays(2));
        System.out.println("A period of 2 days: " + Period.ofDays(2));
    }
}
