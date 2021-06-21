package com.artemisa.datastructures.Deque;

import com.artemisa.datastructures.linkedlist.DoublyLinkedList;
import com.artemisa.datastructures.linkedlist.DoublyLinkedListImpl;
import com.artemisa.datastructures.linkedlist.Node;

public class CustomDequeImpl<T> implements CustomDeque<T> {

    private final DoublyLinkedList<T> data;

    public CustomDequeImpl() {
        this.data = new DoublyLinkedListImpl<>();
    }

    @Override
    public void enqueueHead(T value) {
        this.data.addHead(value);
    }

    @Override
    public void enqueueTail(T value) {
        this.data.addTail(value);
    }

    @Override
    public T dequeHead() {
        Node<T> head = this.data.getHead();

        if (head != null) {
            this.data.remove(head.getValue());
        } else {
            throw new IllegalStateException("There is no head. Empty data");
        }

        return head.getValue();
    }

    @Override
    public T dequeTail() {
        Node<T> tail = this.data.getTail();

        if (tail != null) {
            this.data.remove(tail.getValue());
        } else {
            throw new IllegalStateException("There is no tail. Empty data");
        }

        return tail.getValue();
    }

    @Override
    public T peekHead() {
        Node<T> head = this.data.getHead();

        return head != null ? head.getValue() : null;
    }

    @Override
    public T peekTail() {
        Node<T> tail = this.data.getTail();

        return tail != null ? tail.getValue() : null;
    }

}
