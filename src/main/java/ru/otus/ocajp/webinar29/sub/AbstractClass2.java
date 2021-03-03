package ru.otus.ocajp.webinar29.sub;

public abstract class AbstractClass2 extends ConcreteClass{

    public AbstractClass2() {
        System.out.println("AbstractClass2, constructor");
    }

    public AbstractClass2(String param) {
        super("from constructor AbstractClass2");
        System.out.println("AbstractClass2, constructor with param = " + param);
    }
}
