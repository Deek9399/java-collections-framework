package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClasDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(20);
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add(1,"Pear"); // adds pear at first index
        fruits.set(2,"Strawberr"); //replaces element

        System.out.println(fruits);
    }
}
