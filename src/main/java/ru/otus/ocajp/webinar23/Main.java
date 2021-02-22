package ru.otus.ocajp.webinar23;

import java.util.Arrays;

// Создание методов, которые принимают аргументы и возвращают значения. Применение модификаторов доступ
public class Main {

    private static void printObjectVarargs(Object... obj) {
        System.out.println(obj[0]);
    }

    public static void main(String args[]) {
        System.out.println("Webinar#23.\nJDK: " + System.getProperty("java.version"));

        System.out.println("first case");
        printObjectVarargs("9", "8", "7"); // print "9"
        printObjectVarargs(new int[]{9, 8, 7}); // print "[I@6bc7c054"

        // compile error: non-varargs call of varargs method with inexact argument type for last parameter
        // cast to Object for a varargs call
        // printObjectVarargs(new Integer[] {9,8,7}); ;

        // compile error - non-varargs call of varargs method with inexact argument type for last parameter
        // cast to Object for a varargs call
        // printObjectVarargs(new String[] {"9", "8", "7"}); ;
        printObjectVarargs(new Object[]{"9", "8", "7"}); // print "9"

        System.out.println("second case");
        printIntVarargs(); // [] you can omit method arguments
        printIntVarargs(10); // [10]
        printIntVarargs(10, 20); // [10,20]
        printIntVarargs(new int[]{15, 25, 35});// [15, 25, 35]

        _testUnderScore();

        // Work only in <= Java 8
        //_();
    }

    private static void printIntVarargs(int... args) {
        System.out.println("printIntVarargs_args = " + Arrays.toString(args));
    }

    // incorrect method name. Java identifier expected
    // private static void 2walk() { }

    private static void _testUnderScore() {
        System.out.println("call method with name star by underscore");
    }

    // Work only in <= Java 8
    /*-
    private static void _() {
        System.out.println("call method with name underscore");
    }

     */

}
