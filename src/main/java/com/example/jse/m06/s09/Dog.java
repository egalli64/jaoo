/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m06.s09;

/**
 * Dog "is-a" Mammal, Barker, and Drinker. And "has-a" Tail
 */
public class Dog extends Mammal implements Barker, Drinker {
    private static final int DEFAULT_TAIL_LEN = 12;
    private Tail tail;

    public Dog(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    public Dog(int gestationDays) {
        super(gestationDays);
        this.tail = new Tail(DEFAULT_TAIL_LEN);
    }

    @Override
    public String toString() {
        return "Dog [tail=" + tail + ", gestation=" + gestation + "]";
    }

    public void wag() {
        tail.wag();
    }

    @Override
    public void bark() {
        System.out.println("Wap!");
    }

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
}
