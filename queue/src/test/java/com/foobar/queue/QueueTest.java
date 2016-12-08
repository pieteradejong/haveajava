package com.foobar.queue;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Unit tests for Queue.
 */

public class QueueTest {
    private ArrayList<Integer> queue;

    @Before
    public void setup() {
        queue = new ArrayList<Integer>();
    }

    @Test
    public void itShouldBeEmptyWhenCreated() {
        assert(queue.isEmpty());
    }

    @Test
    public void itShouldBeNonEmptyAfterAddingElement() {
        queue.enqueue(1);
        assert(queue.isEmpty() == false);
    }

    @Test
    public void itShouldHaveSizeZeroWhenEqualNumberItemsAddedAndRemoved() {
        queue.enqueue(3);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
    }

    @Test
    public void itShouldThrowNoSuchElementExceptionWhenPoppingEmptyQueue() {
        queue.dequeue();
        // TODO: how to verify exception thrown?
    }

    @Test
    public void itShouldReturnLastAddedElementWhenSizeIsOne() {
        // add el to queue of size zero, then pop() should return that el and size should thne be zero
        queue.enqueue(1);
        assertEquals(queue.dequeue() == 1);
    }

    @Test
    public void itShouldReturnAddedElementsInCorrectOrder() {
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        assertEquals(queue.dequeue() == 4);
        assertEquals(queue.dequeue() == 3);
        assertEquals(queue.dequeue() == 2);
        assertEquals(queue.dequeue() == 1);
    }

}
