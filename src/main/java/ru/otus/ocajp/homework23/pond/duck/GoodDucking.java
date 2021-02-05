package ru.otus.ocajp.homework23.pond.duck;

public class GoodDucking {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // default access is OK
        System.out.println(duck.noise); // default access is OK
    }
}
