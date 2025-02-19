package com.java.collection.linkedlist;

import java.util.LinkedList;

public class RetrieveLinkdListElements {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Pear");
        fruits.add("Grapes");
        fruits.add("Mango");
        System.out.println("Linked List -> " + fruits);

        //retrieve first element from list
        System.out.println( "First element: " + fruits.getFirst());

        //retrieve last element from list
        System.out.println( "Last element: " + fruits.getLast());

        //retrieve element at a particular index from list
        System.out.println( "Third element: " + fruits.get(2));

        //get all the elements
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
