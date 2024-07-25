/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Boxing double
 */
public class BoxingDouble {
    /**
     * Create double objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a primitive double
        double df = 42.242;

        // the static factory method valueOf() is the preferred way for boxing
        Double boxed = Double.valueOf(df);
        Double boxed2 = Double.valueOf("-24.424");
        try {
            Double.valueOf("mistake");
        } catch (NumberFormatException ex) {
            System.out.println("Can't box, " + ex);
        }

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Double boxed3 = new Double(Double.MAX_VALUE);

        System.out.printf("A few of boxed double float: %.3f %.3f %g\n", boxed, boxed2, boxed3);
    }
}
