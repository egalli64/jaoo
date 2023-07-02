/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m7.s8;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * File input by Scanner
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
                    log.info("Current result is " + result);
                } else {
                    System.out.println("Bad input, discarded: " + scanner.next());
                }
            }
        }

        System.out.println("Total is " + result);
    }
}
