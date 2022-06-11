package com.example.jse.m10.s03.simple;

import java.util.Arrays;
import java.util.Objects;

public class MyIntArray {
    private int size;
    private int[] data;

    public MyIntArray() {
        this(10);
    }

    public MyIntArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity can't be less than zero");
        }

        this.data = new int[capacity];
        this.size = 0;
    }

    public void add(int elem) {
        if (size == data.length) {
            int increased = data.length * 2;
            if (increased < 0) {
                throw new IllegalStateException("Out of memory");
            } else {
                data = Arrays.copyOf(data, increased);
            }
        }

        data[size] = elem;
        size += 1;
    }

    public int get(int pos) {
        Objects.checkIndex(pos, size);
        return data[pos];
    }

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
