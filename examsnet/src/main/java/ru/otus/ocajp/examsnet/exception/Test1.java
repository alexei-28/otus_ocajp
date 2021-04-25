package ru.otus.ocajp.examsnet.exception;

import java.util.Arrays;

public class Test1 {
    // A Throwable is thrown by "main"
    public static void main(String[] args) {
        try {
            System.out.println("before test");
            test();
        } catch (Exception ex) {
            System.out.println("exception ");
        }
        System.out.println("end ");
        test3(new String[]{});
    }

    /*-
        Исппользуя "throws" мы можем "напугать" больше чем может произойти на самом деле.
        Но не наоборот.
     */
    static void test() throws Error {
        if (true) throw new AssertionError();
        System.out.println("test ");
    }

    static void test2() throws Exception {
        throw new Exception();
    }

    static void test3(String[] args) {
        try {
            System.out.println("test3, args = " + Arrays.toString(args));
            args = null;
            args[0] = "test";
            System.out.println(args[0]);
        } catch (Exception ex) {
            System.out.println("Exception");
        }
        /*- compile error: exception NullPointerException has already been caught
        catch (NullPointerException e) {

        }
         */
    }
}
