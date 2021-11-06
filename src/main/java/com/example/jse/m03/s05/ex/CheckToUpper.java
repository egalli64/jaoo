package com.example.jse.m03.s05.ex;

/**
 * Sort of simple tester, see JUnit for the real stuff
 */
public class CheckToUpper {
    private static void check(String actual, String expected) {
        if (actual == expected || actual != null && actual.equals(expected)) {
            System.out.println("OK!");
        } else {
            System.out.println(String.format("Failure: %s not equals to %s", actual, expected));
        }
    }

    public static void main(String[] args) {
        testBob();
        testBobUpper();
        testEmpty();
        testNull();
        testPlain();
    }

    public static void testBob() {
        Exercise ex = new Exercise();

        String input = "Bob";
        String actual = ex.toUpper(input);
        String expected = "BOB";

        check(actual, expected);
    }

    public static void testBobUpper() {
        Exercise ex = new Exercise();

        String input = "BOB";
        String actual = ex.toUpper(input);
        String expected = "BOB";

        check(actual, expected);
    }

    public static void testPlain() {
        Exercise ex = new Exercise();
        String input = "A 'random' string with UPPERCASE and _strange_ characters like ⌂!";

        String actual = ex.toUpper(input);
        String expected = "A 'RANDOM' STRING WITH UPPERCASE AND _STRANGE_ CHARACTERS LIKE ⌂!";

        check(actual, expected);
    }

    public static void testEmpty() {
        Exercise ex = new Exercise();

        String input = "";
        String actual = ex.toUpper(input);
        String expected = "";

        check(actual, expected);
    }

    public static void testNull() {
        Exercise ex = new Exercise();

        String input = null;
        String actual = ex.toUpper(input);
        String expected = null;

        check(actual, expected);
    }
}
