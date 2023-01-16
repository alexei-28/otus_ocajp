package ru.otus.ocajp.webinar17;

// Создание и манипуляция String-объектами.
// Проверка идентичности строковых и др.объектов с использованием оператора == и метода equals()
public class Main {
    public static void main(String... args) {
        System.out.println("Webinar#17!\nJDK: " + System.getProperty("java.version"));

        // Методы класса String создают новые объекты только если были изменения.
        String str =  new String("Hello");
        System.out.println(str == str.replace("Z", "z")); // true
        System.out.println(str == str.trim());// true
        System.out.println(str == str.substring(0));// true
        // 3 раза "true" так как не было изменений, а значит новый String объект НЕ создается.

        System.out.println("substring(0) = " + str.substring(0)); // Hello

        String[] str2 = new String[2]; // array with size 2 and all items are null

        // Java считает char целочисленным типом,
        // представляющим значения от 0 до 65535 включительно → стало быть, комперра нет
        char c = 50006; // OK
        System.out.println(c);

        // char c2 = 66535; // compile error

        StringBuilder sb = new StringBuilder("hello");
        String testStr = new String(sb);
        System.out.println("testStr = " + testStr); // hello

        testStr = testStr.replace("he", new StringBuilder("PR"));
        System.out.println("after_replace_testStr = " + testStr); // PRllo

        whileTrueAndEquals();
    }

    private static void whileTrueAndEquals() {
        /*-
        while (true) { // compile time
        }
        System.out.println("Compile time"); // Compile error - Unrichable code, because while(true) on compile time
         */

        /*-
        while ("hello".equals("hello")) { // Runtime
            System.out.println("runtime"); // Infinity loop
        }
         */

        System.out.println("Runtime"); // No compile error, because while ("hello".equals("hello")) on runtime
    }
}
