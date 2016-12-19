package com.foobar.circularbuffer;

import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for a Circular Buffer.
 */
public class CircularBufferTest {

    private CircularBuffer buffer;

    @Before
    public void setup() {
        buffer = new CircularBuffer(10);
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

    @Test
    public void itShouldReadElementsInOrderInserted() {
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        assertEquals(buffer.read(), 1);
        assertEquals(buffer.read(), 2);
        assertEquals(buffer.read(), 3);
    }



}
