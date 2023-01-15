/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m03.s06.ex;

/**
 * Sort of simple tester, see JUnit for the real stuff
 */
public class CheckToUpper {
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
        testBob();
        testBobUpper();
        testEmpty();
        testNull();
        testPlain();
    }

    /**
     * Bob becomes BOB
     */
    public static void testBob() {
        Exercise ex = new Exercise();

        String input = "Bob";
        String actual = ex.toUpper(input);
        String expected = "BOB";

        check(actual, expected);
    }

    /**
     * BOB becomes BOB
     */
    public static void testBobUpper() {
        Exercise ex = new Exercise();

        String input = "BOB";
        String actual = ex.toUpper(input);
        String expected = "BOB";

        check(actual, expected);
    }

    /**
     * Only lowercase characters should change (to the expected uppercase character)
     */
    public static void testPlain() {
        Exercise ex = new Exercise();
        String input = "A 'random' string with UPPERCASE and _strange_ characters like ⌂!";

        String actual = ex.toUpper(input);
        String expected = "A 'RANDOM' STRING WITH UPPERCASE AND _STRANGE_ CHARACTERS LIKE ⌂!";

        check(actual, expected);
    }

    /**
     * Empty string should be managed correctly
     */
    public static void testEmpty() {
        Exercise ex = new Exercise();

        String input = "";
        String actual = ex.toUpper(input);
        String expected = "";

        check(actual, expected);
    }

    /**
     * null should be managed correctly
     */
    public static void testNull() {
        Exercise ex = new Exercise();

        String input = null;
        String actual = ex.toUpper(input);
        String expected = null;

        check(actual, expected);
    }
}
