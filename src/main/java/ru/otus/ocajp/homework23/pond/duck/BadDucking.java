package ru.otus.ocajp.homework23.pond.duck;

public class BadDucking {

    public void  makeNoise() {
        FutherDuck duck = new FutherDuck();
        //duck.quack(); // compile error. No access to private method "quack()"
        //System.out.println(duck.noise); // compile error. No access to private property "noies"
    }
}
