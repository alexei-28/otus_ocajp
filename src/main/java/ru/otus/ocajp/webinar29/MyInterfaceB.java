package ru.otus.ocajp.webinar29;

/*-
    Compile error:
    Interfaces do not extend java.lang.Object.
    If they did, then Java would support true multiple inheritance, with
    multiple possible parent constructors being called as part of initialization.
 */
//public interface MyInterfaceB extends Object{

public interface MyInterfaceB {
    public double doIt();
}
