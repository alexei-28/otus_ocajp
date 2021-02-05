package ru.otus.ocajp.homework24;

// ДЗ: Применение ключевого слова static к методам и полям.
// Реализация принципов инкапсуляции в классе. Поведение объектных ссылок и примитивных переменных, передаваемых в методы
public class Main {
    private int total = 10;
    private static int count = 2;

    // Любые финальный переменные нужно инициализировать сразу либо в инитерах (static блоки)
    //private static final int one; // compile error. Variable one not initialized in the default constructor
    private static final int two = 2;

    // compile error. Non-static variable "total" cannot be referenced from a static context
    // private static double average = total / count;

    public static void main(String args[]) {
        System.out.println("Homework#24.\nJDK: " + System.getProperty("java.version"));
        doIt(34); // 34
        Integer intRef = 34;
        doIt(intRef); // 34
        Long longRef = 34l;
        doIt(longRef); // 34

        //doIt2(34); // compile error. Incompatible types: possible lossy conversion from int to short
        doIt2((short) 32); // ok, need explicit cast to short
    }

    private static void doIt(long i) {
        System.out.println("i = " +i);
    }

    private static void doIt2(short i2) {
        System.out.println("i2 = "+ i2);
    }
}