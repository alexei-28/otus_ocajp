package ru.otus.ocajp.homework05;

public class Main {
    int x = 5;

    public static void main(String... args) {
        System.out.println("Homework#05");
        //x++; // compile error: on-static variable x cannot be referenced from a static context
    }

    // Локальные переменные нельзя затенять.
    private void myMethod(int w) {
        //int w = 10; // compile error: variable w is already defined in method myMethod(int)
    }
}
