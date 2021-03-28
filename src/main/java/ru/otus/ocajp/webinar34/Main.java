package ru.otus.ocajp.webinar34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
   Oracle Certified Java SE Programmer I: Заключение - Как оптимально пройти экзамен?

   A class cannot inherit two interfaces that declare the same default method, unless the class overrides them.
   Garage collection is not guaranteed to run.
*/
public class Main {
    private static int[][] game;

    public static void main(String []args) {
        System.out.println("Webinar#34.\nJDK: " + System.getProperty("java.version"));

        int[][] game2; // local variable must be initialized
        System.out.println("game = " + Arrays.toString(game)); // null
        // System.out.println("game2 = " + game2); // not compile. Local variable is not initialize(by default)
        // game[0][0] = 10; // throw NPE, because "game" is null
        String s = "old";
        print(s, s = "new");

        String lol = "lol";
        System.out.println(lol == lol); // true

        // method "toUpperCase()" create new String
        System.out.println(lol.toUpperCase() == lol); // false since a String should be compared with a method rather than ==, especially when not comparing two values from the string pool
        System.out.println(lol.toUpperCase() == lol.toUpperCase()); // false since a String should be compared with a method rather than ==, especially when not comparing two values from the string pool

        // The diamond operator <> is only allowed to be used when instantiating rather than declaring.
        // In other words, it can’t go on the left side of the equal sign.
        // List<> list = new ArrayList(); // compile error
        List<String> list = new ArrayList();

        new Dance().someStaticMethod(); //  warning but not compile error to call static method
        Dance.someStaticMethod(); // here correct call static method.

        boolean testBool;
        // compile  error:  variable testBool might not have been initialized
        //System.out.println("test not init testBool = " + testBool);
        if (5 != 6) {

        }
    }

    private static void print(String s1, String s2) {
        System.out.println("s1 = " + s1 + ", s2 = " + s2);
    }
}
