package com.java.collection.hashset;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> programmingLanguages = new HashSet<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("C#");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");

        System.out.println("HashSet: " + programmingLanguages);
    }
}
