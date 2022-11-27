package ru.otus.ocajp.webinar07;

public class Penguin {
    private double test;

    public static void setTest(Penguin penguin) {
        // Uses dot notation to access the instance variable.
        penguin.test = 11.00;

        System.out.println("penguin.test = " + penguin.test);
    }
}
