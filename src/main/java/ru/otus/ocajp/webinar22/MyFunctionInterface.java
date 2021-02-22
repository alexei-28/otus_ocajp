package ru.otus.ocajp.webinar22;

// This function interface has 2 abstract methods.
// It's work because second abstract method "equals()" is override from Object class.
@FunctionalInterface
public interface MyFunctionInterface {

    default void myDefaultMethod() {
        System.out.println("myDefaultMethod");
    }

    static void testMethod() {
        System.out.println("static testMethod");
    }

    public boolean myMethod();

    @Override
    public boolean equals(Object obj);

}
