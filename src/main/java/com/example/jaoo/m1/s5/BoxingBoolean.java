/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m1.s5;

/**
 * Boxing primitives in immutable reference types
 */
public class BoxingBoolean {
    /**
     * List the primitive wrapper types, and create objects from primitives
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        Class<?>[] wrappers = { Boolean.class, Character.class, Short.class, Integer.class, Float.class, Double.class };
        System.out.println("Primitive wrappers:");
        for (var wrapper : wrappers) {
            System.out.println(wrapper.getSimpleName());
        }
        System.out.println();

        boolean flag = false;
        // the static factory method valueOf() is the preferred way for boxing
        Boolean wFlag = Boolean.valueOf(flag);
        Boolean wFlag2 = Boolean.valueOf("true");
        Boolean wFlag3 = Boolean.valueOf("whatever else is false");

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Boolean wFlag4 = new Boolean(flag);

        System.out.printf("A few boxed boolean: %b, %b, %b, %b\n", wFlag, wFlag2, wFlag3, wFlag4);
    }
}
