package ru.otus.ocajp.homework23.pond.shore;

public class BirdWatcher {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWatcher(); // calling protected member
        System.out.println(bird.text); // access protected member
    }
}
