/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s07;

/**
 * A sample cloneable class to show override and overload at work
 */
public class Dog implements Cloneable {
    private static final String DEFAULT_NAME = "Unknown";
    private static final int DEFAULT_AGE = 0;
    private static final double DEFAULT_WEIGHT = 0.8;

    private String name;
    private int age;
    private double weight;

    /**
     * Canonical constructor
     * 
     * @param name   the dog name
     * @param age    the dog age
     * @param weight the dog weight
     */
    public Dog(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    /**
     * A constructor overload
     * 
     * @param name   the dog name
     * @param weight the dog weight
     */
    public Dog(String name, double weight) {
        this.name = name;
        this.age = DEFAULT_AGE;
        this.weight = weight;
    }

    /**
     * The no-arg constructor
     */
    public Dog() {
        this.name = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
        this.weight = DEFAULT_WEIGHT;
    }

    // Won't compile: Cannot reduce the visibility of the inherited method ...
//    @Override
//    protected String toString() {
//        return "A dog";
//    }

    /**
     * Override with covariance, a cloned dog is an actual Dog
     */
    @Override
    protected Dog clone() {
        return new Dog(name, age, weight);
    }

    // Won't compile: Cannot override the final method from Object
//    public void notify() {
//    }

    /**
     * This is _not_ the override of Object::toString(), but just an overload!
     * 
     * @param flag just a flag
     * @return a useless string
     */
    public String toString(boolean flag) {
        return "A dog, flagged as " + flag;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }
}
