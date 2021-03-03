package ru.otus.ocajp.webinar29.sub;

public class ConcreteClass extends AbstractClass {

    public ConcreteClass() {
        System.out.println("ConcreteClass, constructor");
    }

    public ConcreteClass(String param) {
        super("from ConcreteClass");
        System.out.println("ConcreteClass, constructor with param = " + param);
    }
}
