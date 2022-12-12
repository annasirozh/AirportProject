package com.solvd.airport.myLinkedList;

public class MyLinkedList {
    private Node head;

    public MyLinkedList() {
        head = null;
    }

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node firstNode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = firstNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = firstNode;
        }
    }

    public void remove(int data) {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.next != null) {

            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void print() {
        Node currentNode = head;

        if (head != null) {
            System.out.println(head.data);
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }


}
