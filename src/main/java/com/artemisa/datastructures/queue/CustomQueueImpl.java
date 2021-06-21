package com.artemisa.datastructures.queue;

import com.artemisa.datastructures.Deque.CustomDeque;
import com.artemisa.datastructures.Deque.CustomDequeImpl;

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

}
