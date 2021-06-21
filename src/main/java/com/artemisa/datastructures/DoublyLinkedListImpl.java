package com.artemisa.datastructures;

public class DoublyLinkedListImpl<T> implements DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;

    @Override
    public void add(T value) {
        Node<T> node = new Node<>(value);

        if (this.head == null) {
            this.head = node;
        } else {
            node.setPrevious(this.tail);
            this.tail.setNext(node);
        }

        this.tail = node;
    }

    @Override
    public Node<T> find(T value) {
        Node<T> currentNode = this.head;

        while (currentNode != null) {
            if (currentNode.getValue() != null && currentNode.getValue().equals(value)) {
                return currentNode;
            }

            currentNode = currentNode.getNext();
        }

        return null;
    }

    @Override
    public void remove(T value) {
        Node<T> node = this.find(value);

        if (node != null) {
            Node<T> previous = node.getPrevious();
            Node<T> next = node.getNext();

            if (previous != null) {
                previous.setNext(node.getNext());
            }

            if (next != null) {
                next.setPrevious(node.getPrevious());
            }
        }
    }

}
