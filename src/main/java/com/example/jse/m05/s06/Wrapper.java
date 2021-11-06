package com.example.jse.m05.s06;

public class Wrapper {
    public static void main(String[] args) {
        // from boolean to Boolean
        Boolean f1 = Boolean.valueOf(true);
        // not a boolean -> false
        Boolean f2 = Boolean.valueOf("Mistake");
        // case insensitive
        boolean f3 = Boolean.parseBoolean("True");
        System.out.println(String.format("A few booleans: %b, %b, %b", f1, f2, f3));

        System.out.println("Is '9' a digit? " + Character.isDigit('9'));
        System.out.println("Is 'k' a letter? " + Character.isLetter('k'));
        System.out.println("Is 'x' a letter or digit? " + Character.isLetterOrDigit('k'));
        System.out.println("Is 'c' a lowercase letter? " + Character.isLowerCase('c'));
        System.out.println("Is 'W' an uppercase letter? " + Character.isUpperCase('W'));
        System.out.println("'c' to uppercase " + Character.toUpperCase('c'));
        System.out.println("'W' to lowercase " + Character.toLowerCase('W'));

        int primitive = Integer.parseInt("42");
        System.out.println(primitive);
        System.out.println(Integer.toHexString(65535));

        double x = Math.sqrt(-2);
        System.out.println("Square root of -2 is NaN? " + Double.isNaN(x));
        System.out.println("NaN == NaN is ... " + (x == Double.NaN));

        // Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY
        double infinityPos = 1 / 0.0;
        double infinityNeg = -1 / 0.0;
        System.out.println(String.format("Divide by zero for floating points: %f, %f", infinityPos, infinityNeg));
    }
}
