/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s7;

/**
 * Interface vs class example
 * <p>
 * Dog is-a WaggingBarking Jumping
 */
public class Dog implements WaggingBarking, Jumping {
    /** how many times this dog wags its tail */
    private final int wagCount;

    /**
     * Canonical constructor
     * 
     * @param wagCount counter
     */
    public Dog(int wagCount) {
        this.wagCount = wagCount;
    }

    /**
     * No-arg constructor
     */
    public Dog() {
        wagCount = DEFAULT_WAG_COUNT;
    }

    @Override
    public String bark() {
        return "Woof";
    }

    /**
     * A dog specific method
     */
    public void eat() {
        System.out.println("Eating ...");
    }

    /**
     * A dog specific overload
     * 
     * @param count counter
     * @return a string representing the dog barking
     */
    public String bark(int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());
        }

        return sb.toString();
    }

    @Override
    public String wag() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < wagCount; i++) {
            sb.append("Wag");
        }

        return sb.toString();
    }

    @Override
    public void jump() {
        System.out.println("I'm jumping");
    }

    @Override
    public String toString() {
        return "Dog [WAG_COUNT=" + wagCount + "]";
    }
}
