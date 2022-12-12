package com.solvd.airport.myLinkedList;

import org.w3c.dom.Node;

public class LinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size=0;
    java.util.LinkedList


    private static class Node<T>{
        private T currentNode;
        private Node<T> nextNode;
        private Node<T> previousNode;

        public Node(T currentNode, Node<T> nextNode, Node<T> previousNode) {
            this.currentNode = currentNode;
            this.nextNode = nextNode;
            this.previousNode = previousNode;
        }
    }


}
