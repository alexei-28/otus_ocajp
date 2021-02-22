package ru.otus.ocajp.webinar28;

public class Base {
    protected int i;
    //compile error: "static final" variables must be set when they are declared or in a static initialization block.
    //private static final int testFinal;

    Base() {
        // Call override method in child class "Extension.add()"
        add(1);

        // Compile error - Modifier 'static' not allowed here
        // static String test = "Hello";

        // compile error: "static final" variables must be set when they are declared or in a static initialization block.
        //testFinal = 10;
    }

    // Этот метод НИКОГДА не вызовется.
    // Call override method in child class "Extension.add()"
    void add(int v) {
        System.out.println("Base.add");
        i += v;
    }

    void print() {
        System.out.println(i);
    }
}
