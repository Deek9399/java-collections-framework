package com.java.collection.interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> fruitCollection = new ArrayList<>();
        fruitCollection.add("Apple");
        fruitCollection.add("Banana");
        fruitCollection.add("Pear");
        //List allows to add a duplicate element
        fruitCollection.add("Apple");
        //List allows to add a null element
        fruitCollection.add(null);

        System.out.println(fruitCollection);

    }
}
