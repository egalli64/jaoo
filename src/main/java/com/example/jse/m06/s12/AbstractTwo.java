/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s12;

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
