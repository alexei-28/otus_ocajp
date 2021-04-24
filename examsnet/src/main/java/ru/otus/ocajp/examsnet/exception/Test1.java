package ru.otus.ocajp.examsnet.exception;

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
}
