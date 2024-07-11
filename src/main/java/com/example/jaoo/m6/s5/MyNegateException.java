/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m6.s5;

/**
 * A checked exception with extra capabilities
 */
@SuppressWarnings("serial")
public class MyNegateException extends Exception {
    private final int alternativeValue;

    /**
     * Canonical constructor
     * 
     * @param alternativeValue a value close to the actual result
     */
    public MyNegateException(int alternativeValue) {
        this.alternativeValue = alternativeValue;
    }

    /**
     * Getter
     * 
     * @return an alternative value, close to the expected one
     */
    public int getAlternativeValue() {
        return alternativeValue;
    }
}