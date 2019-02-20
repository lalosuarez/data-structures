package com.example.datastructure.stack;

public class Stack<T> {

    private Node<T> top;

    public boolean isEmpty() { return (top == null); }

    public T peek() {
        if (isEmpty()) throw new IllegalStateException("stack is empty");
        return top.data;
    }

    public void push(T data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
    }

    public T pop() {
        if (isEmpty()) throw new IllegalStateException("stack is empty");
        T data = top.data;
        top = top.next;
        return data;
    }

    public void print() {
        if (isEmpty()) return;
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
    }
    
    private static class Node<T> {
        private Node<T> next;
        private T data;

        public Node(T data) {
            this.data = data;
        }
    }
}
