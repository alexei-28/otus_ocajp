package ru.otus.ocajp.webinar27;

// Создание и перегрузка конструкторов, включая влияние на дефолтный конструктор

/*-
Класс нельзя расширить если:
- класс final
- у класса есть private конструктор БЕЗ аргументов (MyParent)
 */
public class Main {

    public static void main(String args[]) {
        System.out.println("Webinar#27.\nJDK: " + System.getProperty("java.version"));

        new MyChild2();
    }
}
