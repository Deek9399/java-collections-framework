package com.java.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoveExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        //remove 3 return value is boolean true
        numbers.remove(3);
        System.out.println(numbers);

        Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);

        //remove a collection from existing collection
        numbers.removeAll(evenNumbers);
        System.out.println(numbers);

        //also clear can be used to remove all elements from hashset
    }
}
