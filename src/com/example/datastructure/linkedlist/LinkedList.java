package com.example.datastructure.linkedlist;

public class LinkedList<T> {

    private Node<T> head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        /* if (head == null) {
            head = new Node(data);
            return;
        } */
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void delete(T data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }

    private static class Node<T> {
        private Node next;
        private T data;

        public Node(T data) {
            this.data = data;
        }
    }
}
