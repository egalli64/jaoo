package com.example.jse.m07.s02;

public class Main {
    public static void main(String[] args) {
        // the caller should check the return value to ensure it is "good"
        double result = noExceptionSquareRoot(-7);
        if (result == -1) {
            System.out.println("...!!!");
        }

        /*
         * ... but what if there is no check?
         */

        System.out.println("result is " + result);

        // in case of exception, if the caller do not take any further step, the program terminates!
        try {
            result = squareRoot(-7);
        } catch (Exception ex) {
            // maybe there is a possible alternative approach
//            System.out.println("... !!! I use instead 5");
//            result = 5;

            // maybe I could just tell the user why I can't go on with the program
            System.out.println("Bad input!");
            throw new IllegalStateException(ex);
        }

        // exceptions are expensive, also in Java they are not always used
//        if (Double.isNaN(result)) {
//            System.out.println("...!!!");
//        }

        try {
            int x = f(3, 0);
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("... " + e.getMessage());
        }

    }

    private static double squareRoot(int value) throws Exception {
        if (value < 0) {
            throw new Exception("Bad input, negative values are not accepted");
        }
        return Math.sqrt(value);
    }

    /**
     * 
     * @param value
     * @return -1 if something went wrong
     */
    private static double noExceptionSquareRoot(int value) {
        if (value < 0) {
            return -1;
        }

        return Math.sqrt(value);
    }

    /**
     * ArithmeticException!
     */
    static int f(int a, int b) throws Exception {
        if (a > b) {
            throw new Exception("Bad values");
        }

        return a + b;
    }
}
