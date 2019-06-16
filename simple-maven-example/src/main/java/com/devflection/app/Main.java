package com.devflection.app;

import org.apache.commons.lang3.ArrayUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void reverseArray(long[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array has to have at least 2 elements to be reversed..");
        }
        ArrayUtils.reverse(array);
    }
}
