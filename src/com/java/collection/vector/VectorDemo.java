package com.java.collection.vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> number = new Vector<>(5,2);
        number.add(1);
        number.add(1);
        number.add(1);
        number.add(1);
        number.add(1);
        number.add(1);
        System.out.println(number.capacity());
    }
}
