package com.artemisa.datastructures.queue;

import com.artemisa.datastructures.deque.CustomDeque;
import com.artemisa.datastructures.deque.CustomDequeImpl;

public class CustomQueueImpl<T> implements CustomQueue<T> {

    private final CustomDeque<T> data;

    public CustomQueueImpl() {
        this.data = new CustomDequeImpl<>();
    }

    @Override
    public void enqueue(T value) {
        this.data.enqueueTail(value);
    }

    @Override
    public T dequeue() {
        return this.data.dequeHead();
    }

    @Override
    public T peek() {
        return this.data.peekHead();
    }

    @Override
    public int size() {
        return this.data.size();
    }

}
