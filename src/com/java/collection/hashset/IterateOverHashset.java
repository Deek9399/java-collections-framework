package com.java.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashset {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // enhanced for
        for (Integer number:numbers){
            System.out.println(number);
        }

        //basic loop with iterator

        for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();){
            Integer number = iterator.next();
            System.out.println(number);
        }

    }
}
