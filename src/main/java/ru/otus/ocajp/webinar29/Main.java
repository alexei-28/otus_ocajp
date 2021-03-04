package ru.otus.ocajp.webinar29;

import ru.otus.ocajp.webinar29.sub.ConcreteClass;
import ru.otus.ocajp.webinar29.sub.ConcreteClass2;
import ru.otus.ocajp.webinar29.sub.ConcreteClass3;

/*-
    Применение абстрактных классов и интерфейсов
*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Webinar#28.\nJDK: " + System.getProperty("java.version"));
        // new MyConcreteClass();

        new ConcreteClass3("from main");
    }
}
