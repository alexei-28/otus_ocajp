package ru.otus.ocajp.webinar27;

public class ClassC extends ClassB {

    // In class static initializer call before constructors
    static {
        System.out.print(" C");
    }
}
