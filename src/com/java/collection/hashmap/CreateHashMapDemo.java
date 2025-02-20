package com.java.collection.hashmap;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapDemo {
    public static void main(String[] args) {
        //example to map numbers to string
        Map<String,Integer> numberMapping = new HashMap<>();

        //add key value to map
        numberMapping.put("one",1);
        numberMapping.put("two",2);
        numberMapping.put("three",3);
        numberMapping.put("four",4);
        numberMapping.put("five",5);
        numberMapping.put(null,0);
        System.out.println(numberMapping);

        //Check if hashMap is empty
        System.out.println("Is hashmap empty? " + numberMapping.isEmpty());

        //Check the size of hashMap
        System.out.println(numberMapping.size());

        //Check if a key exists in a hashmap
        if(numberMapping.containsKey("one")){
            System.out.println("Exists");
        }
        else{
            System.out.println("Does not Exist");
        }
        //Check if a key exists in a hashmap
        if(numberMapping.containsValue(7)){
            System.out.println("Exists");
        }
        else{
            System.out.println("Does not Exist");
        }

        //Get value by key
        System.out.println("One: "+numberMapping.get("one"));

        //remove key from hashmap
        numberMapping.remove("two");
        System.out.println(numberMapping);

        //get only keys from hashmap
        System.out.println(numberMapping.keySet());

        //Iterate hashmap
        //for each
        for (Map.Entry<String, Integer> entry : numberMapping.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //Lambda expression
        numberMapping.forEach((key, value) -> System.out.println(key + " -> " + value));
    }


}
