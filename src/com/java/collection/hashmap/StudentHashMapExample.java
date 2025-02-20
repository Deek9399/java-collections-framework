package com.java.collection.hashmap;

import java.util.HashMap;
import java.util.Map;

class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and setters (if needed)
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method to easily display student information
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StudentHashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap to store Student objects.
        // Here, the key is a String representing the student's ID.
        Map<String, Student> studentMap = new HashMap<>();

        // Creating student instances
        Student student1 = new Student("S001", "Alice", 20);
        Student student2 = new Student("S002", "Bob", 22);
        Student student3 = new Student("S003", "Charlie", 21);

        // Storing students in the HashMap
        studentMap.put(student1.getId(), student1);
        studentMap.put(student2.getId(), student2);
        studentMap.put(student3.getId(), student3);

        // Iterating over the HashMap and printing each student
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
