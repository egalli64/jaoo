package com.example.jse.m02.s07;

/**
 * Example for ternary operator ?:
 * <p>
 * Compared against if-else / default value + if
 */
public class Ternary {
    public static void main(String[] args) {
        String version1 = args.length == 0 ? "No arg passed" : args[0];
        System.out.println(version1);

        // Not nice: split declaration from conditional initialization
        String version2;
        if (args.length == 0) {
            version2 = "No arg passed";
        } else {
            version2 = args[0];
        }
        System.out.println(version2);

        // Not nice: variable is defined, but sometimes immediately reassigned
        String version3 = "No arg passed";
        if (args.length != 0) {
            version3 = args[0];
        }
        System.out.println(version3);
    }
}
