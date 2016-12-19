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
    private int capacity = 10;

    @Before
    public void setup() {
        buffer = new CircularBuffer(capacity);
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

    @Test
    public void itShouldCorrectlyHandleAddingAndReadingMoreThanCapacity() {
        // it should correctly wrap around

        int offset = 2;
        for (int i = 1; i <= capacity + offset; i++) {
            buffer.insert(i);
        }
        // TODO: bufferreadds prints 11, should be offset + 1
        // e.g. we fill to capacity with 1..10, then start again with 11, 12. read() should give 3
        System.out.println(offset);
//        System.out.println(buffer.read());
        assertEquals(buffer.read(), offset + 1);
//        assertEquals(offset + 1, buffer.read());
        assertEquals(buffer.read(), offset + 2);
        assertEquals(buffer.read(), offset + 3);
    }
}
