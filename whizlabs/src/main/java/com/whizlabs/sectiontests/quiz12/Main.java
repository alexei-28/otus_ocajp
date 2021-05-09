package com.whizlabs.sectiontests.quiz12;


/*-
    Whizlabs: Practice Test -> Section Test -> 12: Creating and Using arrays
    https://www.whizlabs.com/learn/course/ocajp-8-online-course/quiz/13841

 */

import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        System.out.println("Creating and Using arrays.\nJDK: " + System.getProperty("java.version"));

        int[] array = {2,5,9,5,0,3};
        Arrays.sort(array, 2,6); // fromIndex(inclusive), toIndex(exclusive)
        System.out.println(array[2] + array[5]); // 9

        long len = 10;
        // Array's size can't be long.
        // int [] ints = new int[len]; // compile error: incompatible types: possible lossy conversion from long to int
    }
}