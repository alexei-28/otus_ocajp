package ru.otus.ocajp.webinar29.sub;

public class ConcreteClass2 extends AbstractClass2 {

    public ConcreteClass2() {
        System.out.println("ConcreteClass2, constructor");
    }

    public ConcreteClass2(String param) {
        super("from ConcreteClass2");
        System.out.println("ConcreteClass2, constructor, param = " + param);
    }
}
