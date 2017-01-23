package com.foobar.heap;

import java.util.ArrayList;

/**
 * Heap
 */


public class Heap {
    private ArrayList<Integer> heap = new ArrayList<Integer>();

    public Heap() {
        heap.add(0, null); // simplify math
    }

    public int peek() throws Exception {
        if (heap.size() <= 1) {
            throw new Exception("Cannot peek into empty heap.");
        }
        return heap.get(1);
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

    public void heapifyUp() throws Exception {
        if(heap.size() < 2) {
            throw new Exception("Cannot heapifyUp when Heap has zero or 1 element.");
        }

        // get last el in aray
        // while parent exist, and parent < el, swap el with parent

        Integer ixLastElement = heap.size() - 1;

        while (heap.get(ixLastElement) > heap.get(ixLastElement/2) && ixLastElement > 1) {
            Integer el = heap.get(ixLastElement);
            Integer parentIx = ixLastElement/2;
            Integer parent = heap.get(parentIx);

            int temp = parent;
            heap.set(parentIx, el);
            heap.set(ixLastElement, temp);


            // reset
            ixLastElement = ixLastElement / 2;



            ix = ix / 2;
//            el = heap.get(ix);
//            parent = heap.get(ix/2);
        }
    }

    public void heapifyDown() {
        int ix = 1;
        while (heap.get(ix) < heap.get(ix * 2) || heap.get(ix) < heap.get(ix * 2 + 1)) {
            if (heap.get(ix) < heap.get(ix * 2)) {
                // swap let child
            } else if (heap.get(ix) < heap.get(ix * 2 + 1)) {
                // swap right child
            }

        }
    }

//    public int getSize() {
//        return heap.size() - 1;
//    }


}
