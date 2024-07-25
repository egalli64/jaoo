/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Boxing float
 */
public class BoxingFloat {
    /**
     * Create float objects
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // a primitive float
        float f = 42.242F;

        // the static factory method valueOf() is the preferred way for boxing
        Float boxed = Float.valueOf(f);
        Float boxed2 = Float.valueOf("-24.424");
        try {
            Float.valueOf("mistake");
        } catch (NumberFormatException ex) {
            System.out.println("Can't box, " + ex);
        }

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Float boxed3 = new Float(Float.MAX_VALUE);

        System.out.printf("A few of boxed float: %.3f %.3f %g\n", boxed, boxed2, boxed3);
    }
}
