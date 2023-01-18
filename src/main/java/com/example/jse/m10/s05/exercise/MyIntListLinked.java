/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s05.exercise;

/**
 * TODO: A single linked list of integers
 * 
 * @see MyIntList
 */
public class MyIntListLinked implements MyIntList {
    /**
     * TODO: list implementation detail
     * 
     * <ul>
     * Each node should keep
     * <li>the current value (an int)
     * <li>the reference to the next element in the list (if any)
     * </ul>
     */
    private static class IntNode {
    }

    private IntNode head;

    /**
     * No-arg constructor
     */
    public MyIntListLinked() {
        this.head = null;
    }

    @Override
    public void add(int value) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int get(int pos) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
