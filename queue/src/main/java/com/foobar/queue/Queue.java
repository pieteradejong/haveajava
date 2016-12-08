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
        return queue.remove(queue.size()-1);
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }
}
