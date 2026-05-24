package model;

import control.CircularLinkedList;

public class Node {
    private Contac value;
    private Node next;




    public Contac getValue() {
        return value;
    }

    public void setValue(Contac value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
