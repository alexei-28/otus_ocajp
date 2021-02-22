package ru.otus.ocajp.webinar27;

public class B  extends A {

    B(String s) {
        // Here Java autocall super()
        System.out.println("B constructor with arg = " +s);
    }
}
