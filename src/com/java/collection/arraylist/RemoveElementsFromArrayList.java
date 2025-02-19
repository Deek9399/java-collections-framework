package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {
    public static void main(String[] args) {
        List <String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Papaya");
        fruits.add("Pear");
        fruits.add("Grapes");
        System.out.println(fruits);

        //remove Papaya from the arraylist
        fruits.remove("Papaya");
        System.out.println(fruits);

        //remove element at second index from list
        fruits.remove(2);
        System.out.println(fruits);

        //remove  collection of few fruits
        List<String> fruitSublist = new ArrayList<>();
        fruitSublist.add("Pear");
        fruitSublist.add("Grapes");

        fruits.removeAll(fruitSublist);
        System.out.println(fruits);

        //clear the fruits arraylist object
        fruits.clear();
        System.out.println(fruits);

    }
}
