package ru.otus.ocajp.webinar30;

public interface SuperParentInterface {

    default void someSuperDefaultMethod() {
        System.out.println("Interface SuperParentInterface: someSuperDefaultMethod() -> Ha-ha-ha super");
    }

    static void someSuperStaticMethod() {
        System.out.println("Interface SuperParentInterface: someSuperStaticMethod() -> A man walk int a bar super");
    }
}
