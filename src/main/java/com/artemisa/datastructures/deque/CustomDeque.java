package com.artemisa.datastructures.deque;

public interface CustomDeque<T> {

    void enqueueHead(T value);

    void enqueueTail(T value);

    T dequeHead();

    T dequeTail();

    T peekHead();

    T peekTail();

    int size();

}
