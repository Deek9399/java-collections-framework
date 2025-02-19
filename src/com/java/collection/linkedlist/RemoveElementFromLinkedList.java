package com.java.collection.linkedlist;

import java.util.LinkedList;

public class RemoveElementFromLinkedList {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Grapes");
        fruits.add("Mango");
        System.out.println("Linked List -> " + fruits);

        //remove first element from list
        fruits.removeFirst();
        System.out.println( "Updated List: " +  fruits);

        //remove last element from list
        fruits.removeLast();
        System.out.println( "Updated List, removed last element: " +  fruits);

        //remove an item from the list
        fruits.remove("Pear");
        System.out.println( "Removed Pear from the list: " +  fruits);

        //clear the linked list
        fruits.clear();
        System.out.println("Clearing the list: " + fruits);

    }
}
