package ru.otus.ocajp.webinar33;

import java.io.FileNotFoundException;

public class Test implements I1 {

    // Overridden methods cannot throw new or broader checked exceptions than the one they inherit.
    @Override
    public void runMe() throws FileNotFoundException {
        System.out.println("runMe");
    }
}
