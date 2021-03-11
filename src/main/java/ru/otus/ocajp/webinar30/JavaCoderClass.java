package ru.otus.ocajp.webinar30;

public class JavaCoderClass implements ChildInterface {

    public static void main(String[] args) {
        new JavaCoderClass().sayHello();
    }

    public void sayHello() {
        System.out.println("JavaCoderClass: sayHello()");
        SuperParentInterface.someSuperStaticMethod();
        ParentInterface.someStaticMethod();
        ChildInterface.super.sayHello();
        // ParentInterface.super.someDefaultMethod(); // compile error
    }
}
