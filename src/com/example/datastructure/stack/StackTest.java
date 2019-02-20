package com.example.datastructure.stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.print();
        System.out.println("peek = " + stack.peek());
        stack.pop();
        stack.print();
        System.out.println("peek = " + stack.peek());
        // stack.peek();
        // stack.pop();
    }
}
