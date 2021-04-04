package ru.otus.ocajp.examsnet.fundamentals;

// https://examsnet.com/test/java-8-certification-language-fundamentals-questions

import java.util.Arrays;

public class Main {
    static final int[] arr = new int[2];
    private static int _123;

    // compile error: array creation with both dimension expression and initialization is illegal
    // static final int[] a = new int[2]{1, 2};
    static final int[] a =  {1, 2};

    static {
        arr[0] = 100;
    }
    public static void main(String... args) {
        System.out.println("Hello, Examsnet.Fundamentals!\nJDK: " + System.getProperty("java.version"));

        int []          x = {1, 2, 3};
        System.out.println("x_many_spaces = " + Arrays.toString(x)); // [1,2,3]
        System.out.println("_123 = " + _123); // 0

    }
}

