package ru.otus.ocajp.webinar29.sub;

public class ConcreteClass3 extends AbstractClass3 {

    public ConcreteClass3() {
        System.out.println("ConcreteClass3, constructor");
    }

    public ConcreteClass3(String param) {
        super("from ConcreteClass3");
        System.out.println("ConcreteClass3, constructor with param = " + param);
    }
}
