package com.foobar.linkedlist;

import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for a LinkedList.
 */
public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void setup() {
        linkedList = new LinkedList();
    }

    @Test
    public void itShouldContainAnElementJustAdded() {
        linkedList.addNode(1);
        assertTrue(linkedList.contains(1));
    }

}
