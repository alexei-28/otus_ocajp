package com.whizlabs.sectiontests.quiz13;

/*-
    Whizlabs: Practice Test -> Section Test -> 13 Quiz: Using Loop Constructs
    https://www.whizlabs.com/learn/course/ocajp-8-online-course/quiz/13842
 */
public class Main {
    public static void main(String... args) {
        System.out.println("13 Quiz: Using Loop Constructs.\nJDK: " + System.getProperty("java.version"));

        int i = 10;
        while(true) {
            i = 20;
            System.out.println("i = " + i);
        }
    }
}