package ru.otus.ocajp.homework23.pond.duck;

public class FutherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise); // private access is OK
    }
    private void makeNoise() {
        quack(); // private access is OK
    }
}
