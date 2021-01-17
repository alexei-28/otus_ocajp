package ru.otus.ocajp.homework18;

public class Main {
    public static void main(String... args) {
        /*-
            StringBuilder is a mutable sequence of characters.
            StringBuilder is used when we want to modify Java strings in-place.
            StringBuffer is a thread-safe equivalent similar of StringBuilder.
         */
        System.out.println("Homework#18!\nJDK: " + System.getProperty("java.version"));
        StringBuilder sb = new StringBuilder(); // default capacity = 16
        System.out.println("capacity = " + sb.capacity());

        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("capacity2 = " + sb2.capacity()); // 16 + 5 =  21

        StringBuilder sb3 = new StringBuilder(10); // init by capacity = 10
        sb3.append((CharSequence) null); // null convert to string "null"
        System.out.println("capacity3 = " + sb3.capacity()); // 10

        StringBuilder sb4 = new StringBuilder('Z'); // promotion -> create SB with length = 90 (fill by "")

        String str = "_";
        str = str.replace(new StringBuilder('Z'), new StringBuilder("^"));// replace "" by "^"
        System.out.println(str); // -> "^_^"

        StringBuilder sb5 = new StringBuilder("java"); // capacity = 16 + 4 = 20;
        System.out.println("sb5.capacity = " + sb5.capacity());
        sb5.ensureCapacity(32);
        /*-
            Формула вычисления capacity:
            - Берем, то что было (init capacity = 20), умножаем на 2 и прибавляем 2 = 20 *2 + 2 = 42
            - Сравниваем 42 и ensureCapacity(32) и берем максимальное = 42
        */
        System.out.println("sb5 result capacity = " + sb5.capacity()); // 42

        String str2 = null;
        str2 = str2 + 3; // null convert to string "null"
        System.out.println(str2); // "null3"

        StringBuilder sb6 = new StringBuilder("Hello");
        sb6.insert(2, "privet");// "Heprivetllo"
        sb6.insert(5,'Z'); // "HepriZvetllo"
        sb6.replace(2,100, "WOW"); // "HeWOW" // startIndex, endIndex, str
        sb6.delete(1,3); // "HOW" //startIndex, endIndex
        System.out.println(sb6);

        StringBuilder sb7 = new StringBuilder("12345");
        sb7.replace(2,4,"6");
        System.out.println(sb7); // 1265
    }
}