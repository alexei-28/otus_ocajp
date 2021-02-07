package ru.otus.ocajp.webinar23;

import java.util.Arrays;

// Создание методов, которые принимают аргументы и возвращают значения. Применение модификаторов доступ
public class Main {
    public static void main(String args[]) {
        System.out.println("Webinar#23.\nJDK: " + System.getProperty("java.version"));
        print("9", "8", "7"); // print "9"
        print(new int[]{9, 8, 7}); // print "[I@6bc7c054"
        // print(new Integer[] {9,8,7}); // warning: non-varargs call of varargs method with inexact argument type for last parameter;
        // print(new String[] {"9", "8", "7"}); // warning - non-varargs call of varargs method with inexact argument type for last parameter;
        print(new Object[]{"9", "8", "7"}); // print "9"

        test(); // [] you can omit method arguments
        test(10); // [10]
        test(10, 20); // [10,20]
        test(new int[]{15, 25, 35});// [15, 25, 35]
    }

    private static void print(Object... obj) {
        System.out.println(obj[0]);
    }

    private static void test(int... args) {
        System.out.println("args = " + Arrays.toString(args));
    }

}
