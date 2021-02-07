package ru.otus.ocajp.webinar23.pond.duck;

public class MotherDuck {
    String noise = "quack"; // default access

    void quack() {
        System.out.println(noise); // default access is OK
    }

    private void makeNoise() {
        quack();// default access is OK
    }

}
