package com.example.datastructure.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.prepend(3);
        linkedList.append(4);
        linkedList.delete(3);
        linkedList.print();
    }
}
