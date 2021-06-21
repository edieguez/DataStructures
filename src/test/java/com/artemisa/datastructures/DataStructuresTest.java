package com.artemisa.datastructures;

import com.artemisa.datastructures.Deque.CustomDeque;
import com.artemisa.datastructures.Deque.CustomDequeImpl;
import com.artemisa.datastructures.queue.CustomQueue;
import com.artemisa.datastructures.queue.CustomQueueImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataStructuresTest {

    @Test
    void addNodeTest() {
        CustomDeque<String> deque = new CustomDequeImpl<>();
        deque.enqueueHead("A");
        deque.enqueueHead("B");
        deque.enqueueHead("C");

        deque.enqueueTail("1");
        deque.enqueueTail("2");
        deque.enqueueTail("3");

        Assertions.assertEquals("C", deque.dequeHead());
        Assertions.assertEquals("3", deque.dequeTail());
    }

    @Test
    void enqueueDequeueTest() {
        CustomQueue<String> queue = new CustomQueueImpl<>();
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");

        Assertions.assertEquals("A", queue.dequeue());
        Assertions.assertEquals("B", queue.dequeue());
        Assertions.assertEquals("C", queue.dequeue());
    }

}
