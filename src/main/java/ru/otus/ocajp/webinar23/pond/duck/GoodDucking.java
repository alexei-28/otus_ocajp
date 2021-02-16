package ru.otus.ocajp.webinar23.pond.duck;

public class GoodDucking {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // default access(same package) is OK
        System.out.println(duck.noise); // default access(same package) is OK
    }
}
