/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s6;

/**
 * Equality
 */
public class CheckEquality {

    /**
     * A good equality check should work in this way
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        reflexivity();
        symmetry();
        transitivity();
        consistency();
        nullBehavior();
    }

    /**
     * Reflexivity: x equals x
     */
    private static void reflexivity() {
        Object o = new Object();
        if (o.equals(o)) {
            System.out.println("Reflexivity: x equals x");
        } else {
            unexpected();
        }
    }

    /**
     * Symmetry: x equals y -> y equals x
     */
    private static void symmetry() {
        Object o = new Object();
        Object[] others = { o, new Object() };
        for (Object other : others) {
            if (o.equals(other)) {
                if (other.equals(o)) {
                    System.out.println("Symmetry: x equals y -> y equals x");
                } else {
                    unexpected();
                }
            } else {
                if (other.equals(o)) {
                    unexpected();
                } else {
                    System.out.println("Symmetry: x not equals y -> y not equals x");
                }
            }
        }
    }

    /**
     * Transitivity: x equals y and x equals z -> x equals z
     */
    private static void transitivity() {
        Object o = new Object();
        Object[] obj2s = { o, new Object() };
        Object[] obj3s = { new Object(), o };

        for (Object o2 : obj2s) {
            for (Object o3 : obj3s) {
                if (o.equals(o2) && o.equals(o3)) {
                    System.out.print("Transitivity: x equals y and x equals z -> ");
                    if (o.equals(o3)) {
                        System.out.println("x equals z");
                    } else {
                        unexpected();
                    }
                }
            }
        }
    }

    /**
     * Consistency: if x equals y once, x always equals y
     */
    private static void consistency() {
        Object o = new Object();
        Object[] others = { o, new Object() };
        for (Object other : others) {
            if (o.equals(other)) {
                if (o.equals(other)) {
                    System.out.println("Consistency: if x equals y once, x always equals y");
                } else {
                    unexpected();
                }
            } else {
                if (o.equals(other)) {
                    unexpected();
                } else {
                    System.out.println("Consistency: if x not equals y once, x never equals y");
                }
            }
        }
    }

    /**
     * x is never equal to null
     */
    private static void nullBehavior() {
        Object o = new Object();
        if (o.equals(null)) {
            unexpected();
        } else {
            System.out.println("x is never equal to null");
        }
    }

    /**
     * Utility method
     */
    private static void unexpected() {
        System.out.println("This must not happen");
    }
}
