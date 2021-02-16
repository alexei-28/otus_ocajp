package ru.otus.ocajp.webinar23.pond.shore;

public class BirdWatcher {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWatcher(); // calling protected member from the same package - OK
        System.out.println(bird.text); // access protected member from the same packet - OK
    }
}
