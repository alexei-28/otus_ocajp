package ru.otus.ocajp.webinar29;

import ru.otus.ocajp.webinar29.sub.ConcreteClass;
import ru.otus.ocajp.webinar29.sub.ConcreteClass2;

/*-
    Применение абстрактных классов и интерфейсов
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Webinar#28.\nJDK: " + System.getProperty("java.version"));
        // new MyConcreteClass();

        new ConcreteClass2("from main");
    }
}
