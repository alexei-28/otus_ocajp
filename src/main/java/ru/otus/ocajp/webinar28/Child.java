package ru.otus.ocajp.webinar28;

// The use of inheritance in this code defines Child is-a Parent relationship.
public class Child extends Parent {
    public int length = 5;

    // Static methods must have the same signature (the name and method parameters must match).
    // Hiding Parent static method
    protected static int someStaticMethod() {
        System.out.println("Child.someStaticMethod");
        return 2;
    }

    // Access modifier (default) in Child is narrower than in Parent.
    // Compile error - someStaticMethod() in Child cannot override someStaticMethod() in Parent
    /*-
    static int someStaticMethod() {
        System.out.println("Child.someStaticMethod");
        return 2;
    }
     */

    // Return type is not covariant.
    // Compile error: someStaticMethod2() in Child cannot override someStaticMethod2() in Parent.
    /*-
    protected static Object someStaticMethod2() {
        System.out.println("Child.someStaticMethod2");
        return null;
    }
     */

    public static void main(String args[]) {
        // Child is actype (actual type)
        Child child = new Child();
        // Parent is a reftype (reference type)
        Parent parent = new Child();
        System.out.println(child.length); // 5
        // переменные зависят от reftype (Parent)
        System.out.println(parent.length); // 2

        Child.someStaticMethod();
        Child.someStaticMethod2();

        StringBuilder stringBuilder = new StringBuilder("Hello");
        // Not need use toString() for pretty print
        System.out.println("stringBuilder = " + stringBuilder); // Hello
    }
}
