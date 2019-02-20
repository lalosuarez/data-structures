package com.example.datastructure.queue;

public class Queue<T> {

    private Node<T> first;
    private Node<T> last;

    public boolean isEmpty() {
        return (first == null);
    }

    /**
     * Gets the head data.
     *
     * @return
     */
    public T peek() {
        if (isEmpty()) throw new IllegalStateException("queue is empty");
        return first.data;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (last != null) {
            last.next = newNode;
        }
        last = newNode;
        if (isEmpty()) first = last;
    }

    public T remove() {
        if (isEmpty()) throw new IllegalStateException("queue is empty");
        T data = first.data;
        first = first.next;
        if (isEmpty()) last = null;
        return data;
    }

    public void print() {
        if (isEmpty()) return;
        Node<T> current = first;
        while (current != null) {
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
