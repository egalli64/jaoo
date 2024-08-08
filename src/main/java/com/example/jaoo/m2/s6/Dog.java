/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m2.s6;

import java.util.Objects;

/**
 * A sample class (actually, a JavaBean) - notice that derivation from Object
 * does not require an explicit declaration
 */
public class Dog extends Object {
    private String name;
    private String owner;

    /**
     * Canonical constructor
     * 
     * @param name
     * @param owner
     */
    public Dog(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }

    /**
     * No-arg constructor
     * <p>
     * Dangerously leave the fields to null!
     */
    public Dog() {
    }

    /**
     * Getter
     * 
     * @return the dog name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter
     * 
     * @param name the dog name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter
     * 
     * @return the dog owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Setter
     * 
     * @param owner the owner name
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Compare for equality this dog with another (that) dog. All IDEs with decent
     * Java support provide tools to automatically generate standard code (as this)
     * <p>
     * Two dogs objects are considered equal if name and owner are equal
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            // reflexivity
            return true;
        }
        if (!(obj instanceof Dog)) {
            // a dog won't be equal to a non-dog
            return false;
        }

        Dog that = (Dog) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner);
    }

    /**
     * Consider using an external library for better performance or use IDE
     * auto-generation tool or extract code from Arrays.hashCode()
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }

    /**
     * Consider using IDE auto-generation tool
     */
    @Override
    public String toString() {
        return "Dog [" + name + ", " + owner + "]";
    }
}
