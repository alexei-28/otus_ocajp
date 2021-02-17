package ru.otus.ocajp.webinar16;

import java.util.Arrays;
import java.util.List;

// Сравнение циклических конструкций. Команда return. Недоступный код
public class Main {
    public static void main(String... args) {
        System.out.println("Webinar#16!\nJDK: " + System.getProperty("java.version"));

        List<String> list = Arrays.asList("args", "bb");
        System.out.println("list = " + list);

        /*-
        int x = 0;
        for (int x = 0; x < 5; x ++) { // error - повторная декларация
        }
        */

        // Body выполняется до секции "forUpdate"
        for (int x = 0; x < 3; x++) {
            System.out.println("x = " + x); // 0,1,2
        }
        System.out.println();
        for (int i = 0; i < 3; ++i) {
            System.out.println("i = " + i); // 0,1,2
        }
        System.out.println();
        for (int j = 0; j < 3;) {
            j++;
            System.out.println("j = " + j); // 1,2,3
        }
        System.out.println();
        for (int y = 0; y < 3;) {
            ++y;
            System.out.println("y = " + y); // 1,2,3
        }
        test();

        label: if (true)
            for(int index = 0; index < 2; index++) {
                System.out.println("index = " + index);
                //continue label; // error
                continue;// ok
            }
    }

    private static void test() {
        System.out.println("Hello");
        http://otus.ru
        return; // without "return" will be compile error
    }
}
