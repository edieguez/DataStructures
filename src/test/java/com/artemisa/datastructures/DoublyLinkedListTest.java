package com.artemisa.datastructures;

import org.junit.jupiter.api.Test;

public class DoublyLinkedListTest {

    @Test
    void addNodeTest() {
        DoublyLinkedList<String> linkedList = new DoublyLinkedListImpl<>();
        linkedList.remove("Z");
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        System.out.println(linkedList);
        System.out.println(linkedList.find("D"));

        linkedList.remove("C");
        linkedList.add("C");

        System.out.println(linkedList);
    }

}
