package com.foobar.stack;

import java.util.ArrayList;

/**
 * Created by pieterdejong on 11/30/16.
 */
public class Stack {

    private ArrayList<Integer> stack = new ArrayList<Integer>();;

    public int size() {
        return this.stack.size();
    }

    public int push(int n) {
        this.stack.add(n);
        return n;
    }

    public int pop() {
        return this.stack.remove(this.stack.size()-1);
    }

    public int peek() {
        return this.stack.get(this.stack.size() - 1);
    }
}