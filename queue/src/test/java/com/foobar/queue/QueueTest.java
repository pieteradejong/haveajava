package com.foobar.queue;

import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Unit tests for Queue.
 */

public class QueueTest {

    private Queue queue;

    @Before
    public void setup() {
        queue = new Queue();
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
    public void itShouldBeEmptyWhenEqualNumberItemsAddedAndRemoved() {
        queue.enqueue(3);
        queue.enqueue(3);
        queue.dequeue();
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        assertEquals(queue.getSize(), 0);
    }

    @Test(expected=NoSuchElementException.class)
    public void itShouldThrowExceptionWhenDequeueingEmptyQueue() {
        queue.dequeue();
    }

    @Test
    public void itShouldReturnLastAddedElementWhenSizeIsOne() {
        queue.enqueue(1);
        assertTrue(queue.dequeue() == 1);
    }

    @Test
    public void itShouldReturnAddedElementsInCorrectOrder() {
        queue.enqueue(4);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        assertTrue(queue.dequeue() == 4);
        assertTrue(queue.dequeue() == 3);
        assertTrue(queue.dequeue() == 2);
        assertTrue(queue.dequeue() == 1);
    }
}
