package ru.otus.ocajp.homework23.pond.shore;

// "protected" modifier - has access only from:
// 1. same class
// 2. same package
// 3. subclass
public class Bird {
    protected String text = "floating";

    protected void floatInWatcher() {
        System.out.println(text);
    }
}
