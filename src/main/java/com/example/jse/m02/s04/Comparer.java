/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m02.s04;

/**
 * Comparison operators
 */
public class Comparer {
    /**
     * Comparison operators on primitives, and equals() on references
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        int alpha = 12;
        int beta = 21;
        int gamma = 12;
        System.out.println("alpha = " + alpha);
        System.out.println("beta = " + beta);
        System.out.println("gamma = " + gamma);

        boolean result = alpha < beta; // true
        System.out.println("alpha < beta? " + result);

        result = alpha < gamma; // false
        System.out.println("alpha < gamma? " + result);

        result = alpha <= gamma; // true
        System.out.println("alpha <= gamma? " + result);

        result = alpha > beta; // false
        System.out.println("alpha > beta? " + result);

        result = alpha > gamma; // false
        System.out.println("alpha > gamma? " + result);

        result = alpha >= gamma; // true
        System.out.println("alpha >= gamma? " + result);

        result = alpha == beta; // false
        System.out.println("alpha == beta? " + result);

        result = alpha == gamma; // true
        System.out.println("alpha == gamma? " + result);

        result = alpha != beta; // true
        System.out.println("alpha != beta? " + result);

        result = alpha != gamma; // false
        System.out.println("alpha != gamma? " + result);

        // For references, == is _not_ about the content
        String a = "solution";
        String b = "sol";
        String c = "ution";
        String d = b + c;

        if (a != d) {
            System.out.println("The references a and d go to different objects");
        }
        if (a.equals(d)) {
            System.out.println("Still, a is equal to d!");
        }

        // Java is often smart enough to see there is already the required string
        // Two references to the same object
        String e = "solution";
        if (a == e) {
            System.out.println("The references a and e go to the same object");
        }
        if (a.equals(e)) {
            System.out.println("So, a is equal to e");
        }
    }
}
