package ru.otus.ocajp.webinar27;

public class BirdParent {
    /*-
       Method fly() is marked as private in the parent class PelicanChild, which means it may only be hidden, not overridden.
       With hidden methods, the specific method used depends on where it is referenced.
       Since it is referenced within the PelicanChild class, the method BirdParent.fly() was used.
    */
    private void fly() {

        System.out.println("BirdParent is flying");

    }

    public static void main(String[] args) {
        BirdParent bird = new PelicanChild();
        bird.fly(); // BirdParent is flying
    }
}
