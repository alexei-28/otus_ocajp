package ru.otus.ocajp.webinar11;

// Логические операторы. Порядок выполнения
public class Main {
    public static void main(String... args) {
        System.out.println("Webinar#11!\nJDK: " + System.getProperty("java.version"));

        // The XOR ^ operator evaluates to "true" if p and q differ and "false" if they are the same.
        boolean p = true;
        boolean q = false;
        boolean first = p ^ q;
        System.out.println("first = " + first); // true

        boolean second = true ^ true;
        System.out.println("second = " + second); // false
    }

}
