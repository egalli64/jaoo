/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s4.other;

/**
 * this and super
 * <p>
 * Base class
 */
public class Dog {
    private static final String DEFAULT_NAME = "???";
    private static final int DEFAULT_WEIGHT = 7;

    private String name;
    private int weight;

    /**
     * No-arg constructor
     */
    public Dog() {
        this(DEFAULT_NAME, DEFAULT_WEIGHT);
    }

    /**
     * A constructor
     * 
     * @param name dog name
     */
    public Dog(String name) {
        this(name, DEFAULT_WEIGHT);
    }

    /**
     * A constructor
     * 
     * @param weight dog weight
     */
    public Dog(int weight) {
        this(DEFAULT_NAME, weight);
    }

    /**
     * Canonical constructor
     * 
     * @param name   dog name
     * @param weight dog weight
     */
    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * Getter
     * 
     * @return dog name
     */
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", weight=" + weight + "]";
    }
}
