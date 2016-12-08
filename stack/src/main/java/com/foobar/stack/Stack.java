package com.foobar.stack;

import java.util.ArrayList;

/**
 * Created by pieterdejong on 11/30/16.
 */
public class Stack {

    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<Integer>();
    }

    public int size() {
        return stack.size();
    }

    public int push(int n) {
        stack.add(n);
        return n;
    }

    public int pop() {
        return stack.remove(stack.size()-1);
    }

    public int peek() {
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}