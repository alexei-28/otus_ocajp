package ru.otus.ocajp.webinar23.pond.swam;

import ru.otus.ocajp.webinar23.pond.duck.MotherDuck;

public class BadCygnet {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        //duck.quack();// default access -> not compile
        //System.out.println(duck.noise); // default access -> not compile
    }
}