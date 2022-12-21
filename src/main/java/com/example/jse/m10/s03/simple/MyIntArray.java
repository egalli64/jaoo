/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s03.simple;

import java.util.Arrays;
import java.util.Objects;

/**
 * A simple, int based, resizable array
 */
public class MyIntArray {
    /** default capacity */
    private static final int EMPTY_CAPACITY = 0;
    /** lowest actual capacity, when not specified by caller */
    private static final int INITIAL_CAPACITY = 8;
    /** number of elements in the array */
    private int size;
    /** storage, its length is <= to size */
    private int[] data;

    /**
     * No args ctor, an empty array is generated
     */
    public MyIntArray() {
        this(EMPTY_CAPACITY);
    }

    /**
     * Empty array with a given capacity
     * 
     * @param capacity the required capacity
     * @throws IllegalArgumentException if capacity is negative
     */
    public MyIntArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity can't be less than zero");
        }

        this.data = new int[capacity];
        this.size = 0;
    }

    /**
     * Add a new element in the rightmost position
     * <p>
     * If no room is available, capacity is increased
     * 
     * @param elem
     */
    public void add(int elem) {
        if (size == data.length) {
            int increased = data.length == 0 ? INITIAL_CAPACITY : data.length * 2;
            if (increased < 0) {
                throw new IllegalStateException("Out of memory");
            } else {
                data = Arrays.copyOf(data, increased);
            }
        }

        data[size] = elem;
        size += 1;
    }

    /**
     * Return the element at the specified position
     *
     * @param pos element index
     * @return the element at the specified position
     * @throws IndexOutOfBoundsException if index is out of bound
     */
    public int get(int pos) {
        Objects.checkIndex(pos, size);
        return data[pos];
    }

    /**
     * Remove the element at the specified position
     * <p>
     * Shift the elements to the left. Since we are working on primitives, leaving
     * the last element "dirty" is not an issue
     *
     * @param pos the element index
     * @return the removed element
     * @throws IndexOutOfBoundsException if index is out of bound
     */
    public int remove(int pos) {
        Objects.checkIndex(pos, size);
        int result = data[pos];

        size -= 1;
        if (size > pos) {
            System.arraycopy(data, pos + 1, data, pos, size - pos);
        }

        return result;
    }

    /**
     * Number of elements
     *
     * @return the number of elements
     */
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("[ ");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            result.append(' ');
        }

        result.append(']');
        return result.toString();
    }
}
