/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s6;

import java.time.Instant;

/**
 * java time Instant
 */
public class InstantMain {
    /**
     * Basic Instant functionality
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Instant for now(): " + Instant.now());

        System.out.println("An instant passing millis: " //
                + Instant.ofEpochMilli(900_000_000_000L));
        System.out.println("An instant passing seconds: " //
                + Instant.ofEpochSecond(1_000_000_000L));
        System.out.println("An instant passing seconds and nano adjustment: " //
                + Instant.ofEpochSecond(1_000_000_000L, 1_000_000_000L));

        System.out.println("Now, UNIX time in secs: " + Instant.now().getEpochSecond());
    }
}
