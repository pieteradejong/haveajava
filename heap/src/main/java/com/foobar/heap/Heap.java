package com.foobar.heap;

import java.util.ArrayList;

/**
 * Heap
 */


public class Heap {
    private ArrayList<Integer> heap = new ArrayList<Integer>();

    public Heap() {
        heap.add(0, null);
    }

    public int peek() throws Exception {
        if (heap.size() <= 1) {
            throw new Exception("Cannot peek into empty heap.");
        }
    }

    public int insert(int n) {
        heap.add(n);
        heapifyUp();
        return n;
    }

    public int remove() throws Exception {
        if (getSize() < 1) {
            throw new Exception("Cannot remove element from empty heap.");
        }
        return n;
    }

    public void heapifyUp() {
        int ix = getSize();

//        int el = heap.get(ix);
//        int parent = heap.get(ix/2);

        while (heap.get(ix) < heap.get(ix / 2) && ix > 1) {
            int temp = heap.get(ix / 2);
            heap.set(ix / 2, ix);
            heap.set(ix, temp);

            ix = ix / 2;
//            el = heap.get(ix);
//            parent = heap.get(ix/2);

        }
    }

    public void heapifyDown() {

    }

    public int getSize() {
        return heap.size() - 1;
    }


}
