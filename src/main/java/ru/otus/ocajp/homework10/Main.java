package ru.otus.ocajp.homework10;

public class Main {

    public static void main(String... args) {
        System.out.println("Homework#10!\nJDK: " + System.getProperty("java.version"));

        System.out.println("" + 10 + 5 == 4 + 11 + "");// false -> строка "105" слева и строка "15" справа
        System.out.println("" + 10 + 5 == 50 + 55 + "");// true -> строка "105" слева и строка "105" справа
    }

}