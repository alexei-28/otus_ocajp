package ru.otus.ocajp.homework10;

public class Main {

    public static void main(String... args) {
        System.out.println("Homework#10!\nJDK: " + System.getProperty("java.version"));

        System.out.println("" + 10 + 5 == 4 + 11 + "");// false -> строка "105" слева и строка "15" справа
        System.out.println("" + 10 + 5 == 50 + 55 + "");// true -> строка "105" слева и строка "105" справа

        // Поменять местами 2 числа без использования 3-й переменной
        int a = 2, b = 4;
        System.out.println("before swap: a = " + a + ", b = " + b);
        a = a + b; // a = 2 + 4 = 6
        b = a - b; // b = 6 - 4 = 2
        a = a - b; // a = 6 - 2 = 4
        System.out.println("after swap:  a = " + a + ", b = " + b);

        short h = 40;
        // h = (short) h + (short) 2; // compile error, promotion to int
        h = (short) ((short) h + (short) 2); // ok
        System.out.println("h = " + h); // 42

        short s = 10;
        //Integer i = s; // compile error
        int si = s;
        Integer i = (int) s;
        System.out.println("i = " + i +", si = " + si);

        int test = 1;
        test += test++ - --test;
        System.out.println("test = " + test);
    }

}