package com.artemisa.datastructures;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {

    private Node<T> previous;
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

}
