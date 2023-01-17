/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m07.s06;

/**
 * A checked exception with extra capabilities
 */
public class MyNegateException extends Exception {
    private static final long serialVersionUID = 1L;
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