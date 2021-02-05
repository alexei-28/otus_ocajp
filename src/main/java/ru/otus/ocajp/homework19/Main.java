package ru.otus.ocajp.homework19;

import java.util.Arrays;

// ДЗ: Объявление, инстанциация и применение одномерных и многомерных массивов
public class Main {
    public static void main(String args[]) {
        System.out.println("Homework#19.\nJDK: " + System.getProperty("java.version"));

        /*-
            Array size can't defined with the array declaration
            int arrArray[2]; // compile error
            String[2] strArray; // compile error
            int[2] mArr[3]; // compile error
            float[] lion = new float[]; // compile error (dimension required)
        */
        int[] arrTest = new int[]{1, 2, 3};
        double[] arrTest1 = new double[2];
        double arrTest2[] = new double[5];
        double arrTest3[] = {};

        System.out.println("arrTest1 = " + Arrays.toString(arrTest1) // [0.0, 0.0]
                + ", arrTest2 = " + Arrays.toString(arrTest2) // [0.0, 0.0, 0.0, 0.0, 0.0]
                + ", arrTest3 = " + Arrays.toString(arrTest3)); // []

        //int[] arr0 = new int[]; // error, must init array dimension
        int[][] arrMulti = new int[2][2];
        //int[][] arrMulti2 = new int[][2]; // compile error
        int intArray[];
        intArray = new int[3];
        System.out.println("intArray = " + Arrays.toString(intArray));
        //intArray = {1, 2}; // compile error (initialize can't be here)
        int[] arr2 = new int[]{(((1))), 2, 3}; // ok

        int[] arr3 = new int[]{1, 2, 3};
        int[] arr4 = new int[]{3, 2, 1};
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println(arr3 == arr4); // false
        System.out.println(arr3.equals(arr4)); // false
        int[] arr5 = new int[]{3, 2, 1};
        System.out.println(arr5 == arr4); // false
        System.out.println(arr5.equals(arr4)); // false

        int[][] arr6 = {{}};
        Object obj = arr6;
        int[][] arr7 = (int[][]) obj; // ok
        System.out.println("arr7 =" + arr7);
        // int[] arr8 = (int[]) obj; // ClassCastException

        int[] arr9 = {};
        //double[] arr10 = arr9; // compile error

        int[][] arr11 = new int[][]{{}};
        //arr11[0][0] = 0; // ArrayIndexOfException

        int[] arr12 = new int[5];
        arr12[0] = 10;
        long test = 20;
        //arr12[1] = test; // compile error (only int).Java doesn’t support implicit narrowing conversions.
        arr12[1] = (int) test;
        char c = 'c';
        arr12[3] = c; // 99 (promotion)
        System.out.println("arr12 = " + Arrays.toString(arr12));

        int[] arrTest10 = {1,2,3}; // [1, 2, 3]
        int[][] arrTest20 = new int[1][3];
        for (int index = 0; index < arrTest20.length; index++) {
            for (int index2 = 0; index2 < arrTest20[index].length; index2++) {
                arrTest20[index][index2] = 1;
            }
        }
        System.out.println("arrTest10 = "+ Arrays.toString(arrTest10));
        for (int[] ints : arrTest20) {
            System.out.println("arrTest10 = " + Arrays.toString(ints)); // [1, 1, 1]
        }

        String[] nums = new String[] {"1", "9", "10"};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); // [1, 10, 9]  without quotes

        String[] testArray = new String[0];
        System.out.println("testArray = " + Arrays.toString(testArray)); // []

        String[] testArray1 = new String[1];
        System.out.println("testArray1 = " + Arrays.toString(testArray1)); // [null]
    }
}
