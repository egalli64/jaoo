/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s06;

/**
 * Ensure equality works fine on Dog objects
 * 
 * @see Dog class Dog definition
 */
public class DogEquality {
    private static final String BOB_FULL_NAME = "Robert Barkright";
    private static final String WILL_FULL_NAME = "William Barkright";

    /**
     * Check Dog equals()
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Dog bob = new Dog("Bob", BOB_FULL_NAME);

        reflexivity(bob);
        symmetry(bob);
        transitivity(bob);
        consistency(bob);
        nullBehavior(bob);
    }

    /**
     * Reflexivity: x equals x
     */
    private static void reflexivity(Dog bob) {
        Dog bob2 = new Dog("Bob", BOB_FULL_NAME);

        System.out.printf("bob is %s, id: %x%n", bob, System.identityHashCode(bob));
        System.out.printf("bob2 is %s, id: %x%n", bob2, System.identityHashCode(bob2));

        if (bob.equals(bob2)) {
            System.out.println("Reflexivity: x equals x");
        } else {
            unexpected();
        }
    }

    /**
     * Symmetry: x equals y -> y equals x
     */
    private static void symmetry(Dog bob) {
        Dog[] others = { new Dog("Bob", BOB_FULL_NAME), new Dog("Bob", WILL_FULL_NAME) };
        for (Dog other : others) {
            if (bob.equals(other)) {
                if (other.equals(bob)) {
                    System.out.println("Symmetry: x equals y -> y equals x");
                } else {
                    unexpected();
                }
            } else {
                if (other.equals(bob)) {
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
    private static void transitivity(Dog bob) {
        Dog[] dogs2 = { new Dog("Bob", BOB_FULL_NAME), new Dog("Bob", WILL_FULL_NAME) };
        Dog[] dogs3 = { new Dog("Zip", WILL_FULL_NAME), new Dog("Bob", BOB_FULL_NAME) };

        for (Dog o2 : dogs2) {
            for (Dog o3 : dogs3) {
                if (bob.equals(o2) && bob.equals(o3)) {
                    System.out.print("Transitivity: x equals y and x equals z: ");
                    if (bob.equals(o3)) {
                        System.out.println("x must equals z");
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
    private static void consistency(Dog bob) {
        Dog[] others = { new Dog("Bob", BOB_FULL_NAME), new Dog("Bob", WILL_FULL_NAME) };
        for (Object other : others) {
            if (bob.equals(other)) {
                if (bob.equals(other)) {
                    System.out.println("Consistency: if x equals y once, x always equals y");
                } else {
                    unexpected();
                }
            } else {
                if (bob.equals(other)) {
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
    private static void nullBehavior(Dog bob) {
        if (bob.equals(null)) {
            unexpected();
        } else {
            System.out.println("x is never equal to null");
        }
    }

    private static void unexpected() {
        System.out.println("This must not happen");
    }
}
