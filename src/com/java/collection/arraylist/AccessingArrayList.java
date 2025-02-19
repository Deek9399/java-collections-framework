package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessingArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        //Check if arraylist numbers is empty
        System.out.println("Is numbers empty? "+ numbers.isEmpty());

        numbers.add(1);
        numbers.add(3);
        numbers.add(34);
        numbers.add(56);
        numbers.add(78);

        //Check the size of the list
        System.out.println("Size: "+ numbers.size());

        //Retrieve element at given index
        System.out.println("Second Number: "+ numbers.get(1));

        //Change second number to 10
        numbers.set(1,10);
        System.out.println("Updated Second Number: "+ numbers.get(1));

    }
}
