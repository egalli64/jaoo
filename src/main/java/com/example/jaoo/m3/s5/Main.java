/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5;

/**
 * Abstract class
 */
public class Main {
    /**
     * Concrete class vs abstract class
     * 
     * @param args not used
     */
    public static void main(String[] args) {
        // Won't compile: Cannot instantiate the type ...
//        AbstractClass abc = new AbstractClass();
//        AbstractTwo abt = new AbstractTwo();

        // Instantiate a concrete class, upcast to base class
        AbstractClass ac = new ConcreteClass();
        ac.anAbstractMethod();

        AbstractTwo at = new ConcreteTwo();
        at.aConcreteMethod();
    }
}
