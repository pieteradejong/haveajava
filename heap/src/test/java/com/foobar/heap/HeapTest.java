package com.foobar.heap;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Unit tests for Heap.
 */
public class HeapTest {

    private Heap heap;

    @Before
    public void setup() {
        heap = new Heap();
    }

    @Test
    public void itShouldBeEmptyWhenNoElementsAdded() {
        assertTrue(set.isEmpty());
    }

    @Test
    public void itShouldBeEmptyAfterElementsAddedAndRemoved() {
        set.addElement(1);
        set.addElement(2);
        set.removeElement(1);
        set.removeElement(2);
        assertTrue(set.isEmpty());
    }

    @Test
    public void itShouldContainElementAfterAdding() {
        set.addElement(5);
        assertTrue(set.contains(5));
    }

    @Test
    public void itShouldNotContainElementNotAdded() {
        assertFalse(set.contains(1));
    }

    @Test
    public void itShouldNotContainElementAfterRemoving() {
        set.addElement(1);
        set.removeElement(1);
        assertFalse(set.contains(1));
    }
}