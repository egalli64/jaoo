package m09.s03;

import java.util.Objects;

public class MyArray<T> {
    private int size = 0;
    private int capacity;
    private Object[] data;

    public MyArray() {
        this(10);
    }

    public MyArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity can't be less than zero");
        }

        this.capacity = capacity;
        this.data = new Object[capacity];
    }

    public void add(T elem) {
        if (size < capacity) {
            data[size] = elem;
            size += 1;
        } else {
            throw new IllegalStateException("Array is full");
        }
    }

    @SuppressWarnings("unchecked")
    public T get(int pos) {
        Objects.checkIndex(pos, size);
        return (T) data[pos];
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
