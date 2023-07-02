/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m8.s15;

import java.util.Objects;

/**
 * A Comparable JavaBean
 */
public class Dog implements Comparable<Dog> {
    private String name;
    private String owner;

    /**
     * Canonical constructor
     * 
     * @param name  dog name
     * @param owner dog owner
     */
    public Dog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    /**
     * Getter
     * 
     * @return dog name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     * 
     * @param name new dog name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * 
     * @return dog owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Setter
     * 
     * @param owner new dog owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object obj) {
        // or use IDE auto-generation tool
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Dog)) {
            return false;
        }

        Dog that = (Dog) obj;
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
    public int compareTo(Dog that) {
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
