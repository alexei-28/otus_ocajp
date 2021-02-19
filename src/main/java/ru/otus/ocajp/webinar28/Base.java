package ru.otus.ocajp.webinar28;

public class Base {
    protected int i;

    Base() {
        // Call override method "Extension.add()"
        add(1);
    }

    // Этот метод НИКОГДА не вызовется
    void add(int v) {
        System.out.println("Base.add");
        i += v;
    }

    void print() {
        System.out.println(i);
    }
}
