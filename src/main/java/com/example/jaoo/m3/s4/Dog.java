/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s4;

import java.util.Objects;

/**
 * A Comparable Dog
 */
public class Dog implements Comparable<Dog> {
    private String name;
    private String owner;
    private int age;

    /**
     * Canonical constructor
     * 
     * @param name  dog name
     * @param owner dog owner
     * @param age   dog age
     */
    public Dog(String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    /**
     * Compare first by name. If they are equal, compare by owner. If also owner is
     * the same, compare by age.
     */
    @Override
    public int compareTo(Dog that) {
        int nameComparison = this.name.compareTo(that.name);
        if (nameComparison != 0) {
            return nameComparison;
        }

        int ownerComparison = this.owner.compareTo(that.owner);
        if (ownerComparison != 0) {
            return ownerComparison;
        }

        return Integer.compare(this.age, that.age);
    }

    @Override
    public int hashCode() {
        // consider using an external library for better performance
        // or use IDE auto-generation tool
        // or extract code from Arrays.hashCode()
        return Objects.hash(age, name, owner);
    }

    @Override
    public boolean equals(Object that) {
        // or use IDE auto-generation tool
        if (this == that)
            return true;
        if (!(that instanceof Dog)) {
            return false;
        }
        Dog other = (Dog) that;
        return age == other.age && Objects.equals(name, other.name) && Objects.equals(owner, other.owner);
    }

    @Override
    public String toString() {
        // or use IDE auto-generation tool
        return "Dog [" + name + ", " + owner + "]";
    }
}
