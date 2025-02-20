package com.java.collection.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetFromCollection {
    public static void main(String[] args) {
        Set<Integer> firstFiveEvenIntegers = new HashSet<>();
        firstFiveEvenIntegers.add(2);
        firstFiveEvenIntegers.add(4);
        firstFiveEvenIntegers.add(6);
        firstFiveEvenIntegers.add(8);
        firstFiveEvenIntegers.add(10);
        Set<Integer> tenPrimeNumbers = new HashSet<>();
        tenPrimeNumbers.addAll(firstFiveEvenIntegers);
        Set<Integer> nextFiveEvenIntegers = new HashSet<>();
        nextFiveEvenIntegers.add(12);
        nextFiveEvenIntegers.add(14);
        nextFiveEvenIntegers.add(16);
        nextFiveEvenIntegers.add(18);
        nextFiveEvenIntegers.add(20);

        System.out.println(tenPrimeNumbers);
        tenPrimeNumbers.addAll(nextFiveEvenIntegers);
        System.out.println(tenPrimeNumbers);


    }
}
