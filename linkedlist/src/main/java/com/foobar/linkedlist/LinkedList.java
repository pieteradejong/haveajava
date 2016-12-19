package com.foobar.linkedlist;


/**
 * Linked List
 */
public class LinkedList {
    private Node head = null;


    private class Node {
        private int value;
        private Node next;

        private Node(int value) {
            this.value = value;
        }
    }

    public Node addNode(int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    public boolean contains(int target) {
        if (head == null) {
            return false;
        }
        Node currNode = head;
        while (currNode != null) {
            if (currNode.value == target) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }
}
