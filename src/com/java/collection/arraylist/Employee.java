package com.java.collection.arraylist;

public class Employee {
    private int id;
    private String name;
    private int age;
    private long salary;

    // In IntelliJ Idea + ubuntu, Alt + Insert and add constructor
    public Employee(String name, int id, int age, long salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
    }

    // In IntelliJ Idea + ubuntu, Alt + Insert and add getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    //Generated similar to getter and setter, required otherwise default toString implementation is done which gives output that are not user-friendly
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
