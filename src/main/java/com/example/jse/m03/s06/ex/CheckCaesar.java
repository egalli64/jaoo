/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s06.ex;

/**
 * Sort of simple tester, see JUnit for the real stuff
 */
public class CheckCaesar {
    /**
     * Simple checker for strings, print the result
     * 
     * @param actual   the actual string
     * @param expected the expected string
     */
    private static void check(String actual, String expected) {
        if (actual == expected || actual != null && actual.equals(expected)) {
            System.out.println("OK!");
        } else {
            System.out.printf("Failure: %s not equals to %s%n", actual, expected);
        }
    }

    /**
     * Run a few tests
     */
    public static void main(String[] args) {
        testCiao1();
        testDjbpMinus1();
        testAppMinus1();
        testAppMinus27();
        testZoo1();
        testZoo27();
    }

    /**
     * CIAO + 1 is DJBP
     */
    public static void testCiao1() {
        Exercise ex = new Exercise();

        String input = "CIAO";
        String actual = ex.caesarEncrypt(input, 1);
        String expected = "DJBP";

        check(actual, expected);
    }

    /**
     * DJBP - 1 is CIAO
     */
    public static void testDjbpMinus1() {
        Exercise ex = new Exercise();

        String input = "DJBP";
        String actual = ex.caesarEncrypt(input, -1);
        String expected = "CIAO";

        check(actual, expected);
    }

    /**
     * ZOO + 1 is APP
     */
    public static void testZoo1() {
        Exercise ex = new Exercise();

        String input = "ZOO";
        String actual = ex.caesarEncrypt(input, 1);
        String expected = "APP";

        check(actual, expected);
    }

    /**
     * APP - 1 is ZOO
     */
    public static void testAppMinus1() {
        Exercise ex = new Exercise();

        String input = "APP";
        String actual = ex.caesarEncrypt(input, -1);
        String expected = "ZOO";

        check(actual, expected);
    }

    /**
     * ZOO + 27 is APP
     */
    public static void testZoo27() {
        Exercise ex = new Exercise();

        String input = "ZOO";
        String actual = ex.caesarEncrypt(input, 27);
        String expected = "APP";

        check(actual, expected);
    }

    /**
     * APP - 27 is ZOO
     */
    public static void testAppMinus27() {
        Exercise ex = new Exercise();

        String input = "APP";
        String actual = ex.caesarEncrypt(input, -27);
        String expected = "ZOO";

        check(actual, expected);
    }
}
