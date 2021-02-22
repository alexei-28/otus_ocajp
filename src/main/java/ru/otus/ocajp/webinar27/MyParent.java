package ru.otus.ocajp.webinar27;

//private class MyClass { // compile error. modifier private not allowed here
//protected class MyClass { // compile error. modifier protected not allowed here
public class MyParent {

    // User defined constructor
    private MyParent() {

    }

    public MyParent(int param) {
        System.out.println("MyParent constructor with param = " + param);
    }

    private class MyInnerClass {

    }

    protected class MyInnerClass2 {

    }
}
