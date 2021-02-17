package ru.otus.ocajp.testcases;

public abstract class Bird {

    // Can't override.
    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String args[]) {
        Bird bird = new Pelican();
        // Because Bird.fly() is private method -> print "Bird is flying".
        // If Bird.fly() not private method -> print "Pelican is flying".
        bird.fly();
    }
}
