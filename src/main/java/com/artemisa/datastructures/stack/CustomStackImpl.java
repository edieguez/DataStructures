package com.artemisa.datastructures.stack;

import com.artemisa.datastructures.deque.CustomDeque;
import com.artemisa.datastructures.deque.CustomDequeImpl;

public class CustomStackImpl<T> implements CustomStack<T> {

    private final CustomDeque<T> data;

    public CustomStackImpl() {
        this.data = new CustomDequeImpl<>();
    }

    @Override
    public void push(T value) {
        this.data.enqueueTail(value);
    }

    @Override
    public T pop() {
        return this.data.dequeTail();
    }

    @Override
    public T peek() {
        return this.data.peekTail();
    }

}
