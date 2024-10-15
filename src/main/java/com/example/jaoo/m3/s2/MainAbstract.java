/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s2;

/**
 * A concrete class has no abstract methods
 */
public class MainAbstract {
    public static void main(String[] args) {
        // An abstract class can't be instantiated
//        AbstractClass ab = new AbstractClass();

        // An interface can't be instantiated
//        AnInterface ai = new AnInterface();

        // Only concrete classes can be instantiated
        ConcreteClass cc = new ConcreteClass();

        cc.a();
    }
}
