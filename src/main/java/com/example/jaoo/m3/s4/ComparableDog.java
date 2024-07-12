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
public class ComparableDog implements Comparable<ComparableDog> {
    private String name;
    private String owner;

    /**
     * Canonical constructor
     * 
     * @param name  dog name
     * @param owner dog owner
     */
    public ComparableDog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object obj) {
        // or use IDE auto-generation tool
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComparableDog)) {
            return false;
        }

        ComparableDog that = (ComparableDog) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner);
    }

    @Override
    public int hashCode() {
        // consider using an external library for better performance
        // or use IDE auto-generation tool
        // or extract code from Arrays.hashCode()
        return Objects.hash(name, owner);
    }

    @Override
    public int compareTo(ComparableDog that) {
        int cmp = this.name.compareTo(that.name);
        if (cmp == 0) {
            return this.owner.compareTo(that.owner);
        }
        return cmp;
    }

    @Override
    public String toString() {
        // or use IDE auto-generation tool
        return "Dog [" + name + ", " + owner + "]";
    }
}
