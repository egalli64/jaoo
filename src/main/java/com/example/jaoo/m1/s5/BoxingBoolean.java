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
     * List the primitive wrapper types, and create boolean objects
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

        // a primitive boolean
        boolean flag = false;

        // the static factory method valueOf() is the preferred way for boxing
        Boolean boxed = Boolean.valueOf(flag);
        Boolean boxed2 = Boolean.valueOf("true");
        Boolean boxed3 = Boolean.valueOf("whatever else is false");

        // the use of constructor is deprecated for removal since Java 9
        @SuppressWarnings("removal")
        Boolean boxed4 = new Boolean(flag);

        System.out.printf("A few boxed boolean: %b, %b, %b, %b\n", boxed, boxed2, boxed3, boxed4);
    }
}
