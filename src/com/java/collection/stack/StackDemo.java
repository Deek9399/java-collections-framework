package com.java.collection.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        // check the last element of stack
        System.out.println("Top element: " + stack.peek());
        //get the element of stack
        System.out.println("Removed top element: " + stack.pop());

        //USING LINKED LIST AS STACK
        LinkedList<Integer> listStack= new LinkedList<>();
        listStack.addLast(1); //push
        listStack.addLast(2);
        listStack.addLast(3);
        listStack.addLast(4);

        System.out.println("Peek "+listStack.getLast()); //peek
        System.out.println("Pop "+listStack.removeLast()); //pop

        System.out.println(listStack);


    }
}
