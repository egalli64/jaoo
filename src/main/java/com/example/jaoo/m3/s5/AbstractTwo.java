/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5;

/**
 * An abstract class. Having no abstract method it could also be concrete. We
 * are forcing Java to not instantiate any object of this class.
 */
public abstract class AbstractTwo {
    /** a concrete method */
    public void aConcreteMethod() {
        System.out.println("hello");
    }
}
