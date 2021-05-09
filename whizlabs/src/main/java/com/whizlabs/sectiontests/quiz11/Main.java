package com.whizlabs.sectiontests.quiz11;

/*-
    Whizlabs: Practice Test -> Section Test -> 11: Using Operators and Decision Constructs
    https://www.whizlabs.com/learn/course/ocajp-8-online-course/quiz/13840

 */

public class Main {
    public static void main(String... args) {
        System.out.println("Using Operators and Decision Constructs.\nJDK: " + System.getProperty("java.version"));

        final int x = 0;
        int y = x;
        System.out.println("x = " + x + ", y = " + y);
        /*-
            Using switch:
            - Duplicate cases not allowed
            - Case should be compile time constant
        */
        switch (y) {
            case x-1: System.out.println("x-1");
            case 1: System.out.println("1");
            case 2: System.out.println("2");
        }
    }
}
