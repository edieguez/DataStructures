package com.artemisa.datastructures;

import com.artemisa.datastructures.Deque.CustomDeque;
import com.artemisa.datastructures.Deque.CustomDequeImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

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

}
