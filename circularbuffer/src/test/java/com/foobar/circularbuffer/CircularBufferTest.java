package com.foobar.linkedlist;

import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for a Circular Buffer.
 */
public class CircularBufferTest {

    private com.foobar.linkedlist.CircularBuffer buffer;

    @Before
    public void setup() {
        buffer = new com.foobar.linkedlist.CircularBuffer(10);
    }

    @Test(expected = NoSuchElementException.class)
    public void itShouldThrowExceptionWhenAttemptingRemoveElementFromEmptyBuffer() {
        buffer.read();
    }

    @Test
    public void itShouldContainAnElementJustAdded() {
        buffer.insert(1);
        assertEquals(buffer.read(), 1);
    }

}
