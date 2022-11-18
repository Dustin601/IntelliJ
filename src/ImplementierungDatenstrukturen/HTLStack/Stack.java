package ImplementierungDatenstrukturen.HTLStack;

import ImplementierungDatenstrukturen.HTLStackList;


public class Stack implements HTLStackList {
    private Node top;

    @Override
    public void push(int value) {
        Node n = new Node(value);
        if (top == null) {
            top = n;
        } else {
            Node actual = top;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(n);
        }
    }

    @Override
    public int pop(int index) {
        return 0;
    }

    @Override
    public int peak(int index) {
        return 0;
    }
}
