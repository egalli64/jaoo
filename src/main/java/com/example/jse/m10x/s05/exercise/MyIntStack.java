package com.example.jse.m10x.s05.exercise;

/**
 * A minimal stack interface
 * 
 * @see MyIntStackLinked
 */
public interface MyIntStack {
    /**
     * Inserts a value on top
     * 
     * @param value the integer to insert
     */
    void push(int value);

    /**
     * Remove the current top from the stack and return its value
     * 
     * @return the value
     * @throws IllegalArgumentException if the stack is empty
     */
    int pop();

    /**
     * Is the stack empty?
     * 
     * @return true if the stack is empty
     */
    boolean isEmpty();
}
