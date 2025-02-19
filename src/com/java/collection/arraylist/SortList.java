package com.java.collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(67);
        numbers.add(25);
        numbers.add(4);
        numbers.add(17);
        numbers.add(9);
        numbers.add(81);
        numbers.add(24);
        numbers.add(22);

        //sort in ascending order
        Collections.sort(numbers);
        System.out.println(numbers);

        //sort a list in descending order
        Collections.reverse(numbers);  // it just reverses the original array, so  first sort and then reverse for descending order
        System.out.println(numbers);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John",1,34,80000));
        employees.add(new Employee("Mary",2,34,120000));
        employees.add(new Employee("Alex",3,32,180000));
        employees.add(new Employee("Dominique",4,36,200000));
        employees.add(new Employee("Mariam",5,29,80000));
        employees.add(new Employee("Pip",6,22,60000));

        Collections.sort(employees, new MySort());
        System.out.println(employees);


     }
}

class MySort implements Comparator<Employee> {

    @Override
    public int compare (Employee emp1, Employee emp2){
        //  return (int) (emp2.getSalary()-emp1.getSalary()); sorts descending order
        return (int) (emp1.getSalary()-emp2.getSalary());
    }
}