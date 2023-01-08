package ru.otus.ocajp.webinar14;

import java.util.ArrayList;
import java.util.List;

// Создание и применение циклов while, do-while, for, for-each
public class Main {
    public static void main(String... args) {
        System.out.println("Webinar#14!\nJDK: " + System.getProperty("java.version"));
        String[] arr = new String[4];
        for (String s : arr) {
            System.out.println("item = " + s); // null (4 times)
        }
        for (int i = 0, j = 1; i < 5; i++, j = j * 2) {
            System.out.println("i = " + i + ", j = " + j);
        }

        /*- Error - нельзя смешивать декларацию
        for (int i = 0, System.out.println("Hello"); i < 3; i++) {
            System.out.println("i = " + i);
        }
        */
        int i; // OK
        for (i = 0, System.out.println("Hello"); i < 3; i++) {
            System.out.println("i = " + i);
        }
        /*-
        Result:
            Hello
            i = 0
            i = 1
            i = 2
        */

        for (int index = 0; index < 5; ) {
            index = ++index; //ok
            //index = index++; // Infinity loop
            System.out.println("Hello, World, index = " + index);
        }
        int j = 3;
        for (; j-- > 0; ) {
            System.out.println("j"); // print "j" 3 times
        }

        int[] nums = {10, 20, 30};
        for (int currentIetm : nums) {
            System.out.println("currentItem(int) = " + currentIetm);
        }

        Integer[] numsInteger = {100, 200, 300};
        for (int currentItem : numsInteger) {
            System.out.println("CurrentItem(Integer) = " + currentItem);
        }

        // infinity loop
        /*-
        for (int index=0; index<10;) {
            index = index++; // The expression inside the loop increments i but then assigns i the old value = 0
            System.out.println("Infinity loop, index = " + index);
        }
         */

        int[] taxis = {10, 20};
        for (int item : taxis) {
            System.out.println("item = " + item);
        }

        String[] fun = {"a", "b"};
        for (String f : fun) {
            System.out.println("f = " + f);
        }
        String race = "sss";
        loop:
        race += "x";
        // break loop; // compile error
        System.out.println();
        compareForLoopWithUpdateSectionAndWithout();
    }

    private static void compareForLoopWithUpdateSectionAndWithout() {
        for (int index = 0; index < 5; index++) {
            System.out.println("index = " + index); // 0 1 2 3 4
        }

        System.out.println();

        for (int index = 0; index < 5;) {
            // index = index++; // index is always 0 and as result infinity loop
            index = index + 1;
            System.out.println("index = " + index); // 1 2 3 4 5
        }
    }


}
