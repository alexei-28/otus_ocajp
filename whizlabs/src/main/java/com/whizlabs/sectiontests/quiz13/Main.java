package com.whizlabs.sectiontests.quiz13;

/*-
    Whizlabs: Practice Test -> Section Test -> 13 Quiz: Using Loop Constructs
    https://www.whizlabs.com/learn/course/ocajp-8-online-course/quiz/13842
 */
public class Main {
    public static void main(String... args) {
        System.out.println("13 Quiz: Using Loop Constructs.\nJDK: " + System.getProperty("java.version"));

        int i = 10;
        /*-
        while(false) {
            // compilation error: unreachable statement
            i = 20;
            System.out.println("i = " + i);
        }
         */

        int x = 0;
        while ((x = 0) > 1) { // always false
            System.out.println("x = " + x);
            x++;
        }

        int x2 = 0;
        while ((x2 = 0) <= 1) {
            System.out.println("x2 = " + x2); // print x2 endlessly
            x2++;
        }
        System.out.println("finish");
    }
}