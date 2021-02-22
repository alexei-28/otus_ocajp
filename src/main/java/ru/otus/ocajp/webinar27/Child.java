package ru.otus.ocajp.webinar27;

public class Child extends Parent {
    int b;

    Child(int c) {
        this(c = 1, c = 2);
        myMethod(c = 10, c = 20);
        myMethod(11,21);
    }

    public Child(int a, int b) {
        super(a);
        this.b = b;
        System.out.println("Child: a = " + a + ", b = " + b);
    }

    private void myMethod(int a, int b) {
        System.out.println("Child: myMethod: a = " + a + ", b = " + b);
    }

}
