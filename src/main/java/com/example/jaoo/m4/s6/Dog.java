/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s6;

/**
 * this and super
 * <p>
 * A derived class
 */
public class Dog extends Pet {
    public static final double STANDARD_SPEED = 0.0;

    /** dog speed */
    private double speed;

    /**
     * No-arg constructor
     */
    public Dog() {
        // implicit call to super
        // super();

        // once the internal part of dog is initialized, set the dog field
        this.speed = STANDARD_SPEED;
    }

    /**
     * Another constructor
     * 
     * @param name dog name
     */
    public Dog(String name) {
        this(name, STANDARD_SPEED);
    }

    /**
     * Canonical constructor
     * 
     * @param name  dog name
     * @param speed dog speed
     */
    public Dog(String name, double speed) {
        super(name);

        // once the internal part of dog is initialized, set the dog field
        this.speed = speed;
    }

    /**
     * Getter
     * 
     * @return the dog speed
     */
    public double getSpeed() {
        return this.speed;
    }

    /**
     * Setter
     * 
     * @param speed the dog speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Dog [speed=" + speed + "] " + super.toString();
    }
}
