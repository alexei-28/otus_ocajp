package ru.otus.ocajp.testcases;

/*
    Since enums are inherently serializable, we don't need to implement it with a serializable interface.
    The reflection problem is also not there.
    Therefore, it is 100% guaranteed that only one instance of the singleton is present within a JVM.
    Thus, this method is recommended as the best method of making singletons in Java.

    "enum" fields are compile time constants, but they are instances of their enum type.
    And, they're constructed when the enum type is referenced for the first time.
 */
public enum SingletonByEnum {
    INSTANCE;

    // You can not use constructor
    private SingletonByEnum() {
        System.out.println("SingletonByEnum user defined constructor");
    }

    public void doWork() {
        System.out.println("SingletonByEnum is working");
    }
}
