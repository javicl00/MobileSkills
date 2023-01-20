package com.mobileskills.randomapp;

import java.util.ArrayList;

public class numbers {
    public static ArrayList<String> numbers = new ArrayList<String>();

    public static void add(String number) {
        numbers.add(0, number); // add the number to the arraylist at the first position
    }

    public static ArrayList<String> getNumbers() {
        return numbers;
    }

    public static int size() {
        return numbers.size();
    }

    public static String get(Integer index) {
        return numbers.get(index.intValue());
    }
}
