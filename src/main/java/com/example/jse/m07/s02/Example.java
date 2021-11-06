package com.example.jse.m07.s02;

public class Example {
    public static void main(String[] args) throws Exception {
        double result = by2(15.3);
        System.out.println(result);

        result = by2(-15.3);
        System.out.println(result);

        result = by2(-15.3);
        if (Double.isNaN(result)) {
            System.out.println("Bad input");
        } else {
            System.out.println(result);
        }

        result = by2Ex(15.3);
        System.out.println(result);

        try {
            result = by2Ex(-15.3);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Bad input, no neg please!"); // to the user
            System.out.println("LOG!"); // to coders
            e.printStackTrace();
        }

//        result = by2Ex(-15.3);
//        System.out.println(result);

        try {
            result = by2ExChecked(-15.3);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Bad input, no neg please!"); // to the user
            System.out.println("LOG!"); // to coders
            e.printStackTrace();
        }

        try {
            result = by2ExChecked(-15.3);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Bad input, no neg please!"); // to the user
            System.out.println("LOG!"); // to coders
            e.printStackTrace();

//            return; // stop this method
//            throw e;
        }


        result = by2ExChecked(-15.3);
        System.out.println(result);
    }

    public static double by2(double value) {
        if (value < 0) {
            return Double.NaN;
        }

        return value * 2;
    }

    public static double by2Ex(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Value should not be negative: " + value);
        }
        System.out.println();

        return value * 2;
    }

    public static double by2ExChecked(double value) throws Exception {
        if (value < 0) {
            throw new Exception("Value should not be negative: " + value);
        }

        return value * 2;
    }
}
