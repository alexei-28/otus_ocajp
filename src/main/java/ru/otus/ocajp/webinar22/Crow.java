package ru.otus.ocajp.webinar22;

import java.util.function.Consumer;

/*-
  Effectively final.

  It's important for lambda expression and only for:
  - Local variables
  - Method parameter
 */
public class Crow {
    private String color;

    public void caw(String name) {
        String volume = "hello";
        //name = "Caty";
        color = "black";

        Consumer<String> consumer = s ->
                System.out.println(name + " says" + volume + " that she is  " + color);

        //volume = "softly"; // compile error - local variables referenced from a lambda expression must be final or effectively final
        System.out.println("In crow class");
    }
}
