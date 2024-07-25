/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Some cases requiring attention when using boxed primitives
 * <p>
 * 2. Beware of null
 */
public class Warning2Null {
    public static void main(String[] args) {
        Double[] boxedValues = new Double[3];
        boxedValues[0] = Math.PI;
        boxedValues[1] = Math.E;

        for (Double boxedValue : boxedValues) {
            tauChecker(boxedValue);
        }
        System.out.println();

        double[] values = new double[3];
        values[0] = Math.PI;
        values[1] = Math.E;

        for (double value : values) {
            tauChecker(value);
        }

    }

    /**
     * Check if the passed value is Math.TAU
     * 
     * @param value is a boxed primitive (does really have to be?)
     */
    private static void tauChecker(Double value) {
        if (value == null) {
            System.out.println("Being the parameter a reference, should be checked against null");
        }

        try {
            if (value == Math.TAU) {
                System.out.println("Unexpected!");
            } else {
                System.out.println("There's no TAU in value");
            }
        } catch (NullPointerException npe) {
            // when you get a reference, a NPE is lurking
            System.out.println("Can't unbox the value for comparison, being a null!");
        }
    }

    /**
     * Check if the passed value is Math.TAU
     * 
     * @param value a primitive (simpler, faster, better)
     */
    private static void tauChecker(double value) {
        if (value == Math.TAU) {
            System.out.println("Unexpected!");
        } else {
            System.out.println("There's no TAU in value");
        }
    }
}
