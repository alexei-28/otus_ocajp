package ru.otus.ocajp.webinar29;

import java.util.ArrayList;

public class MyConcreteClass extends MyAbstractClass {

    public MyConcreteClass() {
        super();
        System.out.println("MyConcreteClass: constructor");
    }

    /*-
        Method signature must match "someAbstractMethod(int age)",
        the method declaration does not need to match, such as using a covariant(in example ArrayList)
        return type or changing the throws declaration.
    */
    @Override
    public ArrayList someAbstractMethod(int age) {
        return null;
    }

    @Override
    public int doIt() {
        return 0;
    }
}
