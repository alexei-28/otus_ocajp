package ru.otus.ocajp.webinar04;

// Объявление и инициализация переменных (включая приведение примитивных типов данных)
public class Main {

    public static void main(String... arg) {
        System.out.println("Webinar#04.\nJDK: " + System.getProperty("java.version"));
        //new Solution();

        new Test().testMethod();

        char myChar; // local variable has not been initialize by default
        //System.out.println("main_myChar = " + myChar); // compile error, variable myChar might not have been initialize
    }
}
