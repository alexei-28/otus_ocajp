package ru.otus.ocajp.webinar23.pond.duck;

public class MotherDuck {
    String noise = "quack"; // default access (only in the same package)

    void quack() { // default access (only in the same package)
        System.out.println(noise);
    }

    private void makeNoise() { // default access is OK
        quack();
    }

}
