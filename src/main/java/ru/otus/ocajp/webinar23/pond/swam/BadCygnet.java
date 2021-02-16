package ru.otus.ocajp.webinar23.pond.swam;

import ru.otus.ocajp.webinar23.pond.duck.MotherDuck;

public class BadCygnet {

    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        //duck.quack();// method "quack" has default access -> not compile
        //System.out.println(duck.noise); // property "noise" has default access -> not compile
    }
}
