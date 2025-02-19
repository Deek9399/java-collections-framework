package com.java.collection.linkedlist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class SearchAndIterateLinkedList {
    public static void main(String[] args) {
        LinkedList<String> classicAuthors = new LinkedList<>();
        // Adding all authors at once using addAll()
        classicAuthors.addAll(Arrays.asList(
                "William Shakespeare",
                "Jane Austen",
                "Charles Dickens",
                "Leo Tolstoy",
                "Fyodor Dostoevsky",
                "Herman Melville",
                "Emily Brontë",
                "Victor Hugo",
                "Jane Austen",
                "Mark Twain",
                "George Orwell"
        ));

        // Printing the list
        System.out.println("Classic Authors: " + classicAuthors);

        //Check if a particular element is present in the list
        System.out.println("Is Leo Tolstoy present in the list? " + classicAuthors.contains("Leo Tolstoy"));

        //find the index of first occurance of an element in linked list
        System.out.println("First Index of jane austen is:" + classicAuthors.indexOf("Jane Austen"));

        //find the index of last occurance of an element in linked list
        System.out.println("Last Index of jane austen is:" + classicAuthors.lastIndexOf("Jane Austen"));

        //Print using Iterator
        Iterator<String> iterator = classicAuthors.iterator();
        while(iterator.hasNext()){
            String author = iterator.next();
            System.out.println("Author:" + author);
        }

        //For each loop
        classicAuthors.forEach((element)-> System.out.println(element));

        //Advanced for each
        System.out.println("***** Advaced For Each Loop *****");
        for(String author:classicAuthors){
            System.out.println(author);
        }
    }
}
