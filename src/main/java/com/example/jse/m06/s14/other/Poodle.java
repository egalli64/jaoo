/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s14.other;

/**
 * this and super
 * <p>
 * Derived class
 */
public class Poodle extends Dog {
    private static final int DEFAULT_DENSITY = 3;
    private static final String DEFAULT_NAME = "!!!";
    private static final int DEFAULT_WEIGHT = 5;
    private int curlDensity; // = 0

    /**
     * No-arg constructor
     */
    public Poodle() {
        this(DEFAULT_NAME);
    }

    /**
     * Constructor
     * 
     * @param name poodle name
     */
    public Poodle(String name) {
        this(name, DEFAULT_WEIGHT);
    }

    /**
     * Constructor
     * 
     * @param name   poodle name
     * @param weight poodle weight
     */
    public Poodle(String name, int weight) {
        this(name, weight, DEFAULT_DENSITY);
    }

    /**
     * Canonical constructor
     * 
     * @param name        poodle name
     * @param weight      poodle weight
     * @param curlDensity poodle curl density
     */
    public Poodle(String name, int weight, int curlDensity) {
        super(name, weight);
        this.curlDensity = curlDensity;
    }

    @Override
    public String getName() {
        return "Poodle " + super.getName();
    }

    @Override
    public String toString() {
        return "Poodle " + super.toString() + " " + curlDensity;
    }
}
