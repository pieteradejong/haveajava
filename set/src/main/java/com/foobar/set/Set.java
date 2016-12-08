package com.foobar.set;

import java.util.HashSet;

/**
 * Hello world!
 *
 */
public class Set {
    private HashSet<Integer> set;

    public Set() {
        set = new HashSet<Integer>();
    }

    public int addElement(int n) {
        set.add(n);
        return n;
    }

    public int removeElement(int n) {
        set.remove(n);
        return n;
    }

    public boolean isEmpty() {
        return set.size() == 0;
    }

    public boolean contains(int n) {
        return set.contains(n);
    }
}
