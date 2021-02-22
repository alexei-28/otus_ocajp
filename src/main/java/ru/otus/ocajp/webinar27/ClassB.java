package ru.otus.ocajp.webinar27;

public class ClassB extends ClassA {

    // In class static initializer call before constructors
    static {
        System.out.print(" B");
    }
}
