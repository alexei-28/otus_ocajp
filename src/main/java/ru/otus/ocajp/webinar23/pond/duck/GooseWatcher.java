package ru.otus.ocajp.webinar23.pond.duck;

import ru.otus.ocajp.webinar23.pond.goose.Goose;

public class GooseWatcher {

    public void watch() {
        Goose goose = new Goose();
        //goose.floatInWatcher(); // compile error, protected method "floatInWatcher"
    }
}
