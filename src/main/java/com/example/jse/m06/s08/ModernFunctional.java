/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s08;

/**
 * The annotation FunctionalInterface let the compiler know that this interface
 * is meant to work in functional context
 */
@FunctionalInterface
public interface ModernFunctional {
    /**
     * a method
     */
    public void example();
}
