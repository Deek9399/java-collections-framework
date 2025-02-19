package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("C", "Java", "JavaScript", "TypeScript", "Python");

        //Basic for loop
        for(int i=0; i<courses.size(); i++){
            System.out.println(courses.get(i));
        }

        //enhanced for each loop
        for(String course : courses){
            System.out.println(course);
        }

        // Using a for loop with an Iterator
        for (Iterator<String> iterator = courses.iterator(); iterator.hasNext(); ) {
            String course = iterator.next();
            System.out.println(course);
        }

        //iterator with while loop
        Iterator<String> iterator = courses.iterator();
        while(iterator.hasNext()){
            String course = iterator.next();
            System.out.println(course);
        }

        // java8 stream + lambda
        System.out.println("Stream + Lambda");
        courses.stream().forEach(course -> System.out.println(course));

        //forEach + Lambda
        courses.forEach((course)-> System.out.println(course));


    }
}
