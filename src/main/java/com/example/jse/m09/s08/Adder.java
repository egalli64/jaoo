package com.example.jse.m09.s08;

import java.util.Scanner;
import java.util.logging.Logger;

public class Adder {
    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0.0;

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
                log.info("Current result is " + result);
            } else {
                System.out.println("Bad input, discarded: " + scanner.next());
            }
        }
        scanner.close();
        System.out.println("Total is " + result);
    }
}
