package ru.otus.ocajp.webinar29.sub;

public abstract class AbstractClass3 extends AbstractClass2 {

    public AbstractClass3() {
        System.out.println("AbstractClass3, constructor");
    }

    public AbstractClass3(String param) {
        super("from constructor AbstractClass3");
        System.out.println("AbstractClass3, constructor with param = " + param);
    }
}
