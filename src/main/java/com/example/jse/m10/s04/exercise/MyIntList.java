/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s04.exercise;

/**
 * Exercise, create a Linked List for primitive integer.
 */
public class MyIntList {
    private Node head;
    private Node tail;

    /**
     * No-arg constructor. The list should be empty.
     */
    public MyIntList() {
        // TODO
    }

    /**
     * Add a new element (where?)
     * 
     * @param value the value for the new element
     */
    public void add(int value) {
        // TODO
    }

    /**
     * Remove an element (form which position?)
     * 
     * @return the value of the removed element
     * @throws MyIntListException in case of problem
     */
    public int remove() throws MyIntListException {
        return Integer.MIN_VALUE;
    }

    @Override
    public String toString() {
        // TODO: should print all the elements in the list
        return String.valueOf(head) + " ... " + String.valueOf(tail);
    }
}
