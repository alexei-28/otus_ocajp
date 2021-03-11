package ru.otus.ocajp.webinar30;

public interface ParentInterface extends SuperParentInterface {

    default void someDefaultMethod() {
        SuperParentInterface.super.someSuperDefaultMethod();// work only for direct parent interface
        System.out.println("Interface ParentInterface: someDefaultMethod() -> Ha-ha-ha");
    }

    static void someStaticMethod() {
        System.out.println("Interface ParentInterface: someStaticMethod() -> A man walk int a bar");
    }
}
