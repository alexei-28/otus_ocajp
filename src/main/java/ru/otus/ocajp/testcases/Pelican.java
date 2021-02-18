package ru.otus.ocajp.testcases;

public class Pelican extends Bird {

    protected void fly() {
        System.out.println("Pelican is flying");
    }

    // shadowing of static method
    protected static void testStaticMethod() {
        System.out.println("Pelican testStaticMethod");
    }

}
