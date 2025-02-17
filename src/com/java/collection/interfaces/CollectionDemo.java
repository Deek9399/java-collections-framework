package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Apple");
        fruitCollection.add("Banana");
        fruitCollection.add("Pear");
        fruitCollection.add("Grapes"); //adds an element to arraylist
        fruitCollection.remove("Banana"); //removes an element form arraylist
        System.out.println(fruitCollection);
        System.out.println("Size Of Collection: "+fruitCollection.size());
        System.out.println("Is apple present? " +fruitCollection.contains("Apple"));

        //Lambda expression
        fruitCollection.forEach((element)->{
                    System.out.println(element);
                });
    }
}
