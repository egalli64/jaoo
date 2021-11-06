package com.example.jse.m10.s06;

/**
 * TODO: A node based stack of integers
 * 
 * @see MyIntList
 */
public class MyIntStackLinked implements MyIntStack {
    /**
     * TODO: stack implementation detail
     * 
     * <ul>
     * Each node should keep
     * <li>the current value (an int)
     * <li>the reference to the previous element in the stack (if any)
     * </ul>
     */
    private static class IntNode {
    }

    private IntNode top;

    public MyIntStackLinked() {
        this.top = null;
    }

    @Override
    public void push(int value) {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int pop() {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        // TODO
        throw new UnsupportedOperationException("Not yet implemented");
    }
}