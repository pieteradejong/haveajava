package com.foobar.linkedlist;


import java.util.NoSuchElementException;

/**
 * Hello world!
 */
public class CircularBuffer {
    private Integer[] buffer;
    private int size;
    private int oldest;
    private int newest;

    CircularBuffer(int n) {
        buffer = new Integer[n];
        size = n;
        oldest = 0;
        newest = 0;
    }

    public int insert(int n) {
        // TODO: insert after newest, modulo length
        buffer[newest] = n;
        if (newest == getSize() - 1) {
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
        return result;
    }

    public int getSize() {
        return size;
    }
}
