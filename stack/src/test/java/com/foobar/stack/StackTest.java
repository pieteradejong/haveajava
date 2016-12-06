package com.foobar.stack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    Stack stack;

    @Before
    public void setup() {
        stack = new Stack();
    }

    @Test
    public void createdStackShouldBeEmpty() {
        assertEquals(stack.size(), 0);
    }

    @Test
    public void containsAddedItem() {
        stack.push(1);
        assertEquals(stack.peek(), 1);
    }

    @Test
    public void itShouldBeEmptyAfterAllItemsHaveBeenRemoved() {
        stack.push(6);
        stack.push(3);
        stack.push(101);
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(stack.size(), 0);
    }
    @Test
    public void itShouldContainAnItemThatWasJustAdded() {
        stack.push(9);
        assertEquals(stack.peek(), 9);
    }
}

