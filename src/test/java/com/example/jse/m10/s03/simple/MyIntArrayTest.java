/*
 * Introduction to Java Standard Edition
 * 
 * https://github.com/egalli64/jse
 */
package com.example.jse.m10.s03.simple;

import static org.assertj.core.api.Assertions.*;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

/**
 * Test case for MyIntArray
 */
class MyIntArrayTest {
    /**
     * Empty array is sized zero
     */
    @Test
    void sizeEmpty() {
        MyIntArray mia = new MyIntArray();
        assertThat(mia.size()).isEqualTo(0);
    }

    /**
     * Empty array has capacity zero
     */
    @Test
    void capacityEmpty() {
        MyIntArray mia = new MyIntArray();
        try {
            Field d = mia.getClass().getDeclaredField("data");
            d.setAccessible(true);
            assertThat(((int[]) d.get(mia)).length).isEqualTo(0);
        } catch (Exception e) {
            fail(e.getClass() + " " + e.getMessage());
        }
    }

    /**
     * Empty array is sized zero whichever is its capacity
     */
    @Test
    void sizeEmptyWithCapacityFour() {
        MyIntArray mia = new MyIntArray(4);
        assertThat(mia.size()).isEqualTo(0);
    }

    /**
     * Check capacity is correctly initialized
     */
    @Test
    void capacityEmptyWithCapacityFour() {
        final int capacity = 4;
        MyIntArray mia = new MyIntArray(capacity);
        try {
            Field d = mia.getClass().getDeclaredField("data");
            d.setAccessible(true);
            assertThat(((int[]) d.get(mia)).length).isEqualTo(capacity);
        } catch (Exception e) {
            fail(e.getClass() + " " + e.getMessage());
        }
    }

    /**
     * Can't set capacity to a negative value
     */
    @Test
    void capacityNegative() {
        assertThatThrownBy(() -> new MyIntArray(-42)) //
                .isInstanceOf(IllegalArgumentException.class) //
                .hasMessage("Capacity can't be less than zero");
    }

    /**
     * Adding an element increase the array size
     */
    @Test
    void addToEmptySize() {
        MyIntArray mia = new MyIntArray();
        mia.add(42);
        assertThat(mia.size()).isEqualTo(1);
    }

    /**
     * Adding an element to an empty array change the capacity to its initial value
     */
    @Test
    void addToEmptyCapacity() {
        MyIntArray mia = new MyIntArray();
        mia.add(42);
        try {
            Field d = mia.getClass().getDeclaredField("data");
            d.setAccessible(true);
            int[] data = ((int[]) d.get(mia));

            Field ic = MyIntArray.class.getDeclaredField("INITIAL_CAPACITY");
            ic.setAccessible(true);
            int initialCapacity = (int) ic.get(mia);

            assertThat(data.length).isEqualTo(initialCapacity);
        } catch (Exception e) {
            fail(e.getClass() + " " + e.getMessage());
        }
    }

    /**
     * Adding elements change the array size correctly
     */
    @Test
    void addfourSize() {
        MyIntArray mia = new MyIntArray(4);
        mia.add(42);
        mia.add(2);
        mia.add(4);
        mia.add(12);
        assertThat(mia.size()).isEqualTo(4);
    }

    /**
     * Adding elements change the array capacity correctly
     */
    @Test
    void addFourCapacity() {
        MyIntArray mia = new MyIntArray();
        mia.add(42);
        mia.add(2);
        mia.add(4);
        mia.add(12);

        try {
            Field d = mia.getClass().getDeclaredField("data");
            d.setAccessible(true);
            int[] data = ((int[]) d.get(mia));

            Field ic = MyIntArray.class.getDeclaredField("INITIAL_CAPACITY");
            ic.setAccessible(true);
            int initialCapacity = (int) ic.get(mia);

            assertThat(data.length).isEqualTo(initialCapacity);
        } catch (Exception e) {
            fail(e.getClass() + " " + e.getMessage());
        }
    }

    /**
     * Get on empty causes an exception
     */
    @Test
    void getOnEmpty() {
        MyIntArray mia = new MyIntArray();
        assertThatThrownBy(() -> mia.get(0)) //
                .isInstanceOf(IndexOutOfBoundsException.class) //
                .hasMessage("Index 0 out of bounds for length 0");
    }

    /**
     * Get on a good index works correctly
     */
    @Test
    void get() {
        MyIntArray mia = new MyIntArray(4);
        mia.add(42);
        mia.add(2);
        mia.add(4);
        mia.add(12);
        assertThat(mia.get(2)).isEqualTo(4);
    }

    /**
     * Remove on empty causes an exception
     */
    @Test
    void removeOnEmpty() {
        MyIntArray mia = new MyIntArray();
        assertThatThrownBy(() -> mia.remove(0)) //
                .isInstanceOf(IndexOutOfBoundsException.class) //
                .hasMessage("Index 0 out of bounds for length 0");
    }

    /**
     * Remove on a good index works correctly
     */
    @Test
    void remove() {
        MyIntArray mia = new MyIntArray(4);
        mia.add(42);
        mia.add(2);
        mia.add(4);
        mia.add(12);
        assertThat(mia.remove(2)).isEqualTo(4);
        assertThat(mia.size()).isEqualTo(3);
    }
}
