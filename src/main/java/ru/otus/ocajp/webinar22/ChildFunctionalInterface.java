package ru.otus.ocajp.webinar22;

@FunctionalInterface
public interface ChildFunctionalInterface extends ParentInterFace {
    //void walk(); // if uncomment then compile error, will because ChildFunctionalInterface become unfunctional interface
    default void walk() { // as result method "walk" become non abstract method. No compile error.

    }

    //int run(); // if uncomment then method become second abstract method -> compile error,  ChildFunctionalInterface become unfunctional interface

    boolean equals(Object obj);
}
