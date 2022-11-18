package ImplementierungDatenstrukturen.HTLStack;

public class Node {
    private int value;
    private Node previous;


    public Node(int value, Node previous){
        this.value = value;
        this.previous = previous;
    }

    public int getValue() {
        return value;
    }

    public Node getPrevious() {
        return previous;
    }

}
