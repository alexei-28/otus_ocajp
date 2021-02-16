package ru.otus.ocajp.webinar27;

public class A {
     A() {
         this ("1", "2");
         System.out.println("A -> Constructor without arguments");
     }

    public A(String s, String s1) {
        this(s + s1);
    }

    public A(String s) {
        System.out.println(s);
    }
}
