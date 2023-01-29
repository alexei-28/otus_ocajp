package ru.otus.ocajp.webinar18;

import javax.print.DocFlavor;
import java.util.function.Predicate;

// Манипуляция данными посредством класса StringBuilder и его методов
public class Main {
    public static void main(String... args) {
        /*-
            StringBuilder is a mutable sequence of characters (implement CharSequence).
            StringBuilder is a final class. As result you can't extend it.
            StringBuilder methods return a reference to the SAME object so you can chain method calls.
            StringBuilder is used when we want to modify Java strings in-place.
            StringBuffer is a thread-safe equivalent similar of StringBuilder.
            StringBuffer is a final class. As result you can't extend it.
         */
        System.out.println("Webinar#18!\nJDK: " + System.getProperty("java.version"));
        StringBuilder sb = new StringBuilder(); // default capacity = 16
        System.out.println("capacity = " + sb.capacity()); // 16

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
        sb6.insert(5, 'Z'); // "HepriZvetllo"
        sb6.replace(2, 100, "WOW"); // "HeWOW" // startIndex, endIndex, str
        sb6.delete(1, 3); // "HOW" //startIndex, endIndex -> "eW"
        System.out.println(sb6);

        StringBuilder sb7 = new StringBuilder("12345");
        sb7.replace(2, 4, "6");
        System.out.println(sb7); // 1265

        String testString = new String(new StringBuilder("hello from sb"));
        System.out.println("testString = " + testString);

        // The "sb8" reference doesn't exist until after the chained calls complete.
        // Just because it happens to be on a separate line doesn't change when the reference is created.
        // Compile error. Variable "sb8" might not have been initialized.
        // StringBuilder sb8 = new StringBuilder("radical").insert(sb8.length(), "robots");

        StringBuilder sb9 = new StringBuilder("radical ").insert(7, "robots");
        System.out.println("sb9 = '" + sb9 + "', length = " + sb9.length()); // "radicalrobots ", 14
        System.out.println("charAt = " + sb9.charAt(1));

        StringBuilder sb10 = new StringBuilder("123");
        sb10.insert(3, "456");
        // sb10.insert(4, "456"); // StringIndexOutOfBoundsException: String index out of range: 4
        System.out.println("sb10 = " + sb10 + ", length = " + sb10.length()); // 123456, 6

        // Can pass StringBuilder as param to String
        String testString2 = new String(sb10);
        System.out.println("testString2 = " + testString2); // 123456

        System.out.println("equals vs ==");
        StringBuilder sbTest1 = new StringBuilder("Hello");
        StringBuilder sbTest2 = new StringBuilder("Hello");
        System.out.println(sbTest1 == sbTest2); // false
        // Method "equals()" not overriding in StringBuilder
        System.out.println(sbTest1.equals(sbTest2)); // false

        StringBuilder sbTest3 = new StringBuilder(sbTest1);
        System.out.println("sbTest3 = " + sbTest3); // Hello

        sbTest3.setLength(2);
        System.out.println("sbTest3 (after) = " + sbTest3); // He
        if ("Integer.class" instanceof String) {

        }
        //if (null instanceof null) {} //  comp error: illegal start of type

        compareStringAndSB();
    }

    private static void compareStringAndSB() {
        StringBuilder sb = new StringBuilder("hello");
        String str = "hello";
        //if (sb == str) // compile error
    }
}