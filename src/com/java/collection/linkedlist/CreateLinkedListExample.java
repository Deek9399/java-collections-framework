package com.java.collection.linkedlist;

import java.util.LinkedList;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Grapes");
        fruits.add("Mango");
        System.out.println("Linked List -> " + fruits);

        //add element at first
        fruits.addFirst("Blueberry");
        System.out.println("Linked List -> " + fruits);

        //add element at last
        fruits.addLast("Strawberry");
        System.out.println("Linked List -> " + fruits);
    }
}
