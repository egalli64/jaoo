/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s5;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
        return Objects.hash(age, name, owner);
    }

    @Override
    public boolean equals(Object that) {
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
        return "Dog [name=" + name + ", owner=" + owner + ", age=" + age + "]";
    }
}
