package com.whizlabs.sectiontests.quiz10;

/*-
    Whizlabs: Practice Test -> Section Test -> 10: Java Data Types
    https://www.whizlabs.com/learn/course/ocajp-8-online-course/quiz/13839

    The interface variables are implicitly final.
 */

public class Main {
    //final int y; // compile error: variable y not initialized in the default constructor
    int y2;
    public static void main(String... args) {
        System.out.println("Java Data Types.\nJDK: " + System.getProperty("java.version"));

        // Underscore are allowed as long as they are directly between two other digits.
        double d1 = 1_22.7;
        System.out.println("d1 = " + d1); // 122.7
        double d2 = 12_2.7;
        System.out.println("d2 = " + d2); // 122.7

        final int x;
        //System.out.println("x = " + x); // compile error: variable x might not have been initialized
        x = 10;
        System.out.println("x = " + x);

        Boolean b = new Boolean("T");
        System.out.println("b = " + b); // false

        Boolean b2 = new Boolean("True");
        System.out.println("b2 = " + b2); // true

        Character character = Character.valueOf('c');
        System.out.println("character = " + character);
    }
}
