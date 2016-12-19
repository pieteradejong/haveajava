package com.foobar.circularbuffer;


import java.util.NoSuchElementException;

/**
 * Circular Buffer
 */
public class CircularBuffer {
    private Integer[] buffer;
    private int capacity;
    private int oldest;
    private int newest;

    CircularBuffer(int n) {
        buffer = new Integer[n];
        capacity = n;
        oldest = 0;
        newest = 0;
    }

    public int insert(int n) {
        buffer[newest] = n;
        newest++;
        if (newest == getCapacity()) {
            newest = 0;
        }
        return n;
    }

    public int read() {
        if (getSize() == 0) {
            throw new NoSuchElementException("Cannot remove element from empty CircularBuffer.");
        }
        int result = buffer[oldest];
        buffer[oldest] = null;
        oldest++;
        return result;
    }

    public int getSize() {
        return newest - oldest;
    }

    public int getCapacity() {
        return capacity;
    }
}
