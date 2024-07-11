/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m4.s5;

/**
 * Pet is a Brushable
 */
public abstract class Pet implements Brushable {
    private String name;

    /**
     * Canonical constructor
     * 
     * @param name the pet name
     */
    protected Pet(String name) {
        this.name = name;
    }

    /**
     * Getter
     * 
     * @return the pet name
     */
    public String getName() {
        return name;
    }

    @Override
    public void brush() {
        System.out.println("Brushing " + name);
    }

    /**
     * The specific noise for a pet. Each pet should have its own
     */
    public abstract void makeNoise();
}
