package ru.otus.ocajp.webinar23.pond.goose;

import ru.otus.ocajp.webinar23.pond.shore.Bird;

public class Gosling extends Bird { // extends means create subclass

    public void swim() {
        floatInWatcher(); // calling protected member - OK
        System.out.println(text); // access protected member - OK
    }
    
}
