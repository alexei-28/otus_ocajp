package ru.otus.ocajp.webinar29;

// Abstract class can contain private inner abstract class
public abstract class MyAbstractClass2 {

    abstract private class MyInnerAbstractClass {
        abstract int someMethod();
    }
}
