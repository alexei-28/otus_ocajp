package ru.otus.ocajp.webinar33;

import java.io.IOException;

public class TestCase1 {

    public void process() {
        System.out.println("A, ");
    }

    class B extends TestCase1 {

        // compile error - overridden method does not throw IOException
        /*-
        public void process() throws IOException {
        }

         */
    }
}
