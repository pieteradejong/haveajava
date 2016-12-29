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

    public int peek() throws Exception{
        if(heap.size() <= 1) {
            throw new Exception("Cannot peek into empty heap.");
        }
    }

    public int insert(int n) {
        heap.add(n);
        heapifyUp(getSize());
    }

    public int remove() throws Exception {
        if(getSize() < 1) {
            throw new Exception("Cannot remove element from empty heap.");
        }


    }

    

    public int getSize() {
        return heap.size() - 1;
    }





}
