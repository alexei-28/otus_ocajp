package ru.otus.ocajp.webinar20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Объявление и применение коллекций ArrayList заданного типа

// An array does not override equals() and so uses object equality.
// ArrayList does override equals() and defines it as the same elements in the same order.
public class Main {
    public static void main(String args[]) {
        System.out.println("Webinar#20.\nJDK: " + System.getProperty("java.version"));
        List  list = new ArrayList(); // default capacity = 10
        System.out.println("list = " + list); // []

        //List<> list2 = new ArrayList<String>(); // compile error - identifier expected


        // ======================================================================
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(20);
        intList.add(40);
        //ArrayList<String> newList = new ArrayList<>(intList); // compile error - inference variable E has incompatible bounds (because use "<>" (Generics) right of "=")
        ArrayList<String> newList2 = new ArrayList(intList); // compile OK, but on runtime will be ClassCastException on the next line
        /*-
        for (String item : newList2) { // on runtime ClassCastException
            System.out.println("item = " + item);
        }
         */
        // To fix this use solution when error on compile time. Use "<>" (Generics) after "="
        // ArrayList<String> newList3 = new ArrayList<>(intList); // Compile error - incompatible types: cannot infer type arguments for ArrayList<>

        // ======================================================================

        // Array String-ов - это подтип Array Object-ов
        Object[] arrObject = new String[10];
        arrObject[0] = "hello";

        // ArrayList String-ов - это НЕ подтип ArrayList Object-ов
        // compile error.Incompatible types: ArrayList<String> cannot be converted to List<Object>
        // List<Object> list3 = new ArrayList<String>();

        // Массив String-ов - это подтип массива Object-ов
        Object[] list4 = new String[4];
        System.out.println("list4 = " + Arrays.toString(list4)); // [null, null, null, null]

        // Convert from array to list.
        // Not ArrayList. It is special FIXED size List. Can't add/remove items.
        // Under the hood "listTest" and "arrayTest" is reference to the SAME one array.
        // As result when change "listTest" then change "arrayTest". And visa versa.
        String[] arrayTest = {"first", "second"};
        List<String> listFixSize = Arrays.asList(arrayTest); // special FIXED size List
        // listFixSize.add("some_item"); // error: java.lang.UnsupportedOperationException
        // listFixSize.remove(1); // error: java.lang.UnsupportedOperationException
        System.out.println(listFixSize.size()); // 2
        listFixSize.set(1, "test"); // "set" return previous item ("second")
        System.out.println("listFixSize = " + listFixSize); // [first, test]
        System.out.println("arrayTest = " + Arrays.toString(arrayTest)); // [first, test]

        arrayTest[0] = "new";
        System.out.println(Arrays.toString(arrayTest)); // [new, test]
        System.out.println(listFixSize); // [new, test]
        // list.remove(1); // throws UnsupportedOperationException
        // list.add("third"); // throws UnsupportedOperationException

        // Convert from list to array
        List<String> list2 = new ArrayList<>();
        list2.add("test1");
        list2.add("test2");
        Object[] objectArray = list2.toArray(); // create INDEPENDENT array. No connection with "list"
        System.out.println("objectArray = " + Arrays.toString(objectArray)); // [test1, test2]
        String[] stringArray = list2.toArray(new String[0]); // create INDEPENDENT array. No connection with "list"
        System.out.println("stringArray = " + Arrays.toString(stringArray)); // [test1, test2]
        list2.clear();
        System.out.println(list2.size()); // 0
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2

        double one = 1.0;
        float two = 1.0f;
        int three = 3;
        double[] array = new double[]{one, two, three}; // ok
        System.out.println("array = " + Arrays.toString(array));

        List baloons = new ArrayList<>();
        //List<> baloons2 = new ArrayList(); // compile error. Identifier expected, Illegal start of type (because use empty "<>")
        ArrayList<String> baloons2 = new ArrayList<>();

        List listWithoutType = new ArrayList<>();

        // Since the left side does not define a generic type, the compiler will treat this as List<Object>,
        // and items of "someList" will have a data type of Object.
        List someList = new ArrayList<Integer>();

        doIt();

        testPrintList();
    }

    private static void doIt() {
        List<StringBuilder> listOne = new ArrayList<>();
        listOne.add(new StringBuilder("Anna"));
        listOne.add(new StringBuilder("Ada"));
        listOne.add(new StringBuilder("Bob"));

        List<StringBuilder> listTwo = new ArrayList<>(listOne);
        listOne.add(null);
        listTwo.get(1).reverse();

        System.out.println("listOne = " + listOne); // [Anna, adA, Bob, null]
    }

    private static void testPrintList() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        System.out.println(list); // [hello]
    }

}
