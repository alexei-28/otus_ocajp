package ru.otus.ocajp.webinar30;

public interface ChildInterface extends ParentInterface {

    default void sayHello() {
        // super.getJoke();// compile error - cannot find symbol. Call "super" is possible ONLY for classes.
        SuperParentInterface.someSuperStaticMethod();
        ParentInterface.super.someDefaultMethod(); // work only for direct parent interface
        ParentInterface.someStaticMethod();
        System.out.println("ChildInterface: sayHello()");
    }

}
