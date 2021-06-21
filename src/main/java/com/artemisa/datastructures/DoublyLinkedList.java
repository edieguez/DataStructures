package com.artemisa.datastructures;

public interface DoublyLinkedList<T> {

    void add(T value);

    Node<T> find(T value);

    void remove(T value);

}
