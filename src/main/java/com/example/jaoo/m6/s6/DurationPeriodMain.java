/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s6;

import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.UnsupportedTemporalTypeException;

/**
 * java time Duration and Period
 */
public class DurationPeriodMain {
    /**
     * Basic Duration and Period functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Duration (almost) zero between times: " //
                + Duration.between(LocalTime.now(), LocalTime.now()));
        System.out.println("Duration zero secs between instants: " //
                + Duration.between(Instant.now(), Instant.now()));
        System.out.println("Duration zero days between instants: " //
                + Period.between(LocalDate.now(), LocalDate.now()));

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
