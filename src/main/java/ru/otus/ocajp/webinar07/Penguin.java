package ru.otus.ocajp.webinar07;

public class Penguin {
    private double test;

    public Penguin() {
        //howMany(true, {true, true}); // Array initializer is not allowed here
        int result  = howMany(true, new boolean[2]); // return 2
        System.out.println("result = "+ result);
    }

    public int howMany(boolean b, boolean... b2) {
        return b2.length;
    }

    public static void setTest(Penguin penguin) {
        // Uses dot notation to access the instance variable.
        penguin.test = 11.00;

        System.out.println("penguin.test = " + penguin.test);

    }
}
