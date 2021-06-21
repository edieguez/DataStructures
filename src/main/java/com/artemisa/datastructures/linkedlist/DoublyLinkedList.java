package com.artemisa.datastructures.linkedlist;

public interface DoublyLinkedList<T> {

    void addHead(T value);

    Node<T> getHead();

    void addTail(T value);

    Node<T> getTail();

    Node<T> find(T value);

    void remove(T value);

    int size();

}
