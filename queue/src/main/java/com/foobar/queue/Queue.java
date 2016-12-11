package com.foobar.queue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Queue implementation
 *
 */
public class Queue {
    ArrayList<Integer> queue;

    public Queue() {
        queue = new ArrayList<Integer>();
    }

    public int enqueue(int n) {
        queue.add(n);
        return n;
    }

    public int dequeue() throws NoSuchElementException {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("Cannot dequeue an empty queue.");
        }
        return queue.remove(0);

    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public int getSize() {
        return queue.size();
    }
}
