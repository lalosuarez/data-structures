package com.example.datastructure.queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.print();
        System.out.println("\npeek = " + queue.peek());
        queue.remove();
        queue.print();
        System.out.println("\npeek = " + queue.peek());
        // queue.remove();
    }
}
