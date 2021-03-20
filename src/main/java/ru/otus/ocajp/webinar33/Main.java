package ru.otus.ocajp.webinar33;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Webinar#33.\nJDK: " + System.getProperty("java.version"));
            Test test = new Test();
            test.runMe();

            ClassC classC = new ClassC();

            //testScope("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // not compile - scope of local variable "s" live on WHOLE method.
    // "s" in catch is conflict with param in method. Same name of variable.
    /*-
    private static void testScope(String s) {
        try {

        } catch (NumberFormatException s) {

        }
    }
     */

}
