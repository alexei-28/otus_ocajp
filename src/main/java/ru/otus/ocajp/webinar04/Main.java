package ru.otus.ocajp.webinar04;

/*-
    Объявление и инициализация переменных (включая приведение примитивных типов данных)
    Test: https://docs.google.com/forms/d/e/1FAIpQLScycljT6BOJservmUA13ly2aclZLyNVob2YTMQJmo-vm2npAA/viewform
    Answer: https://docs.google.com/forms/d/e/1FAIpQLScycljT6BOJservmUA13ly2aclZLyNVob2YTMQJmo-vm2npAA/viewscore?viewscore=AE0zAgA8KWO1Qx5KlLVCP9OnmOencnBop8YaZuDjiQrVsbZ9XiVArsOp_YL9dcqr3xYS1UY
 */
public class Main {

    public static void main(String... arg) {
        System.out.println("Webinar#04.\nJDK: " + System.getProperty("java.version"));
        //new Solution();

        new Test().testMethod();

        char myChar; // local variable has not been initialize by default
        //System.out.println("main_myChar = " + myChar); // compile error, variable myChar might not have been initialize
    }
}
