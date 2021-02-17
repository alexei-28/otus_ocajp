package ru.otus.ocajp.testcases;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public final static void main(String... args) {
        System.out.println("Hello, Test cases!\nJDK: " + System.getProperty("java.version"));

        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = work(s1,s2);
        System.out.println("s1 = " + s1); // s1 = s1
        System.out.println("s2 = " + s2); // s2 = s2b
        System.out.println("s3 = " + s3); // s3 = a

        test();

        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        //Not change because LocalDate is immutable class AND return value is ignored.
        System.out.println(date); // 2018-04-30
    }

    public static StringBuilder work(StringBuilder a, StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }


    private static void test() {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5")); // parseInt return "int" -> autoboxing
        ages.add(Integer.valueOf("6")); // valueOf return "Integer"
        ages.add(null); // autoboxing
        System.out.println("ages = " + ages); // [5, 6, null]
        /*-
        for (int age  : ages) { // NPE because unboxing
            System.out.println("age_in_for = " + age);
        }
         */
    }
}
