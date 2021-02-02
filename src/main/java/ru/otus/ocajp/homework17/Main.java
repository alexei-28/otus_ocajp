package ru.otus.ocajp.homework17;

// ДЗ: Создание и манипуляция String-объектами.
// Проверка идентичности строковых и др.объектов с использованием оператора == и метода equals()
public class Main {
    public static void main(String... args) {
        System.out.println("Homework#17!\nJDK: " + System.getProperty("java.version"));

        // Методы класса String создают новые объекты только если были изменения.
        String str = "Hello";
        System.out.println(str == str.replace("Z", "z")); // true
        System.out.println(str == str.trim());// true
        System.out.println(str == str.substring(0));// true
        // 3 раза "true" так как не было изменений, а значит новый String объект НЕ создается.

        String[] str2 = new String[2]; // array with size 2 and all items are null

        // Java считает char целочисленным типом,
        // представляющим значения от 0 до 65535 включительно → стало быть, комперра нет
        char c = 50006; // OK
        System.out.println(c);

        // char c2 = 66535; // compile error
    }
}
