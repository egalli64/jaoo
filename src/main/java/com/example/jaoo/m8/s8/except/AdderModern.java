/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s8.except;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Modern Scanner with exception
 */
public class AdderModern {
    private static final Logger log = Logger.getGlobal();

    /**
     * Scanner and try-with-resources
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0.0;

        // try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    result += scanner.nextDouble();
                    dangerous();
                    log.info("Current result is " + result);
                } else {
                    System.out.println("Bad input, discarded: " + scanner.next());
                }
            }
        } catch (Exception ex) {
            log.log(Level.SEVERE, "Can't scan", ex);
            System.out.println("Problem while reading");
        }

        System.out.println("Total is " + result);
    }

    /**
     * This call will result in an exception
     */
    private static void dangerous() {
        throw new IllegalArgumentException("Boom!");
    }
}
