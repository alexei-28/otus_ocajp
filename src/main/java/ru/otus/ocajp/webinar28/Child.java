package ru.otus.ocajp.webinar28;

// The use of inheritance in this code defines Child "is-a" Parent relationship.
public class Child extends Parent {
    // Hiding variable
    public int length = 5;

    // Static methods must have the same signature (the name and method parameters must match).
    // Method "someStaticMethod" must be static because this method in parent is static method.
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

    // Can't override final method.
    // Compile error: someFinalMethod() in Child cannot override someFinalMethod() in Parent
    /*
    protected final String someFinalMethod() {

    }
     */

    public static void main(String args[]) {
        // Child is actype (actual type)
        Child child = new Child();
        // Parent is a reftype (reference type)
        Parent parent = new Child();
        System.out.println("child.length = " + child.length); // 5

        // переменные зависят от reftype (Parent)
        System.out.println("parent.length = " + parent.length); // 2

        // child.testFinal = 10; // compile error cannot assign a value to final variable testFinal

        Child.someStaticMethod();
        Child.someStaticMethod2();

        StringBuilder stringBuilder = new StringBuilder("Hello");
        // Not need use toString() for pretty print
        System.out.println("stringBuilder = " + stringBuilder); // Hello
    }
}
