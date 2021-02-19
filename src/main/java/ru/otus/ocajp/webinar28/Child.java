package ru.otus.ocajp.webinar28;

public class Child extends Parent{
    public int length = 5;

    public static void main(String args[]) {
        // Child is actype (actual type)
        Child child = new Child();
        // Parent is a reftype (reference type)
        Parent parent = new Child();
        System.out.println(child.length); // 5
        // переменные зависят от reftype (Parent)
        System.out.println(parent.length); // 2
     }
}
