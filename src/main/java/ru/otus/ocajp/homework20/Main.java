package ru.otus.ocajp.homework20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        System.out.println("Homework#20.\nJDK: " + System.getProperty("java.version"));
        List  list = new ArrayList(); // default capacity = 10
        System.out.println("list = " + list); // []

        // Convert from array to list
        String[] arrayTest = {"first", "second"};

        // Not ArrayList. It is special FIXED size List. Can't add/remove items.
        // Under the hood "listTest" and "arrayTest" is reference to the SAME one array.
        // As result when change "listTest" then change "arrayTest". And visa versa.
        List<String> listTest = Arrays.asList(arrayTest);

        System.out.println(listTest.size()); // 2
        listTest.set(1, "test"); // "set" return previous item ("second")
        System.out.println(listTest); // [first, test]
        System.out.println(Arrays.toString(arrayTest)); // [first, test]

        arrayTest[0] = "new";
        System.out.println(Arrays.toString(arrayTest)); // [new, test]
        System.out.println(listTest); // [new, test]
        // list.remove(1); // throws UnsupportedOperationException
        // list.add("third"); // throws UnsupportedOperationException

        // Convert from list to array
        List<String> list2 = new ArrayList<>();
        list2.add("test1");
        list2.add("test2");
        Object[] objectArray = list2.toArray(); // create INDEPENDENT array. No connection with "list"
        String[] stringArray = list2.toArray(new String[0]); // create INDEPENDENT array. No connection with "list"
        list2.clear();
        System.out.println(list2.size()); // 0
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2

        double one = 1.0;
        float two = 1.0f;
        int three = 3;
        double[] array = new double[]{one, two, three}; // ok
        System.out.println("array = " + Arrays.toString(array));
    }
}
