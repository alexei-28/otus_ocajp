package ru.otus.ocajp.webinar30.sub;

import java.io.FileNotFoundException;

public class Programmer {

    protected final void process() {

    }

    // Protected instance методы также называются "virtual methods".
    protected void myProtectedMethod() {

    }

    public void testMethod() throws FileNotFoundException {
        System.out.println("Programmer testMethod");
    }
}
