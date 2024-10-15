/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s4;

/**
 * Example for Comparable::compareTo
 */
public class MainCompare {
    /**
     * Create two comparable objects and compare them, see what happens when
     * comparing against an object from another class
     * 
     * @param args not used
     */
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        Dog tomBob = new Dog("Tom", "Bob", 4);
        Dog tomCarl = new Dog("Tom", "Carl", 3);
        if (tomBob.compareTo(tomCarl) < 0) {
            System.out.println("Tom-Bob is before Tom-Carl");
        } else {
            System.out.println("Unexpected");
        }

        Cat kim = new Cat();

        // suppressed warning on comparing cat and dog
        if (tomBob.equals(kim)) {
            System.out.println("Unexpected");
        } else {
            System.out.println("The compiler warns about an unlikely argument (if it is not suppressed)");
        }

        // Won't compile: ComparableDog::compareTo() is not applicable to Cat
//        if (tomBob.compareTo(kim)) {
//            // ...
//        }
    }
}
