package ru.otus.ocajp.webinar22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Составление простого лямбда-выражения, которое потребляет Predicate
public class Main {
    public static void main(String args[]) {
        System.out.println("Webinar#22.\nJDK: " + System.getProperty("java.version"));

        List al = new ArrayList<>();
        //check(al, al->al.isEmpty()); // compile error. "al" already exist

        Predicate<List> predicate = alist -> {
            System.out.println("Use Predicate functional interface");
            return alist.isEmpty();
        };

        System.out.println("case first");
        check(new ArrayList(), predicate);

        System.out.println("case second");
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(10);
        check(listInteger, predicate);

        System.out.println("case third");
        check(listInteger, list -> list.isEmpty());

        // Common for a Predicate to have a generic type, it is not required.
        Predicate dash =  c -> c.equals("test");
        System.out.println("dashPredicate = " + dash.test("hello")); // false
    }

    private static void check(List list, Predicate<List> predicate) {
        System.out.println("result = " + predicate.test(list));
    }
}
