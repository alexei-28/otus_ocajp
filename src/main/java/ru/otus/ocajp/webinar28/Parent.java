package ru.otus.ocajp.webinar28;

public class Parent {
    // Variables can only be hidden, not overridden via inheritance.
    public int length = 2;
    public final int testFinal = 20;

    protected static int someStaticMethod() {
        System.out.println("Parent.someStaticMethod");
        return 1;
    }

    protected static String someStaticMethod2() {
        System.out.println("Parent.someStaticMethod2");
        return "this is a parent";
    }

    protected final String someFinalMethod() {
        System.out.println("Parent.someFinalMethod");
        return "someFinalMethod";
    }

}
