/*
 * Introduction to OOP with Java
 * 
 * https://github.com/egalli64/jaoo
 */
package com.example.jaoo.m3.s3;

/**
 * Dog "is-a" Mammal, Barking, and Drinking. And "has-a" Tail
 */
public class Dog extends Mammal implements Barking, Drinking {
    private static final int DEFAULT_TAIL_LEN = 12;
    private Tail tail;

    /**
     * Constructor
     * 
     * @param gestationDays days to get a new dog
     * @param tailLen       the tail length
     */
    public Dog(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    /**
     * Constructor, for a dog having a tail with default length
     * 
     * @param gestationDays days to get a new dog
     */
    public Dog(int gestationDays) {
        super(gestationDays);
        this.tail = new Tail(DEFAULT_TAIL_LEN);
    }

    /**
     * Forward the wag request to the tail
     */
    public void wag() {
        tail.wag();
    }

    /**
     * Barking objects should know how to bark
     */
    @Override
    public void bark() {
        System.out.println("Wap!");
    }

    /**
     * Drinking objects should know how to drink
     */
    @Override
    public void drink() {
        System.out.println("Sip!");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tail == null) ? 0 : tail.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (tail == null) {
            if (other.tail != null)
                return false;
        } else if (!tail.equals(other.tail))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Dog [tail=" + tail + ", gestation=" + gestation + "]";
    }
}
