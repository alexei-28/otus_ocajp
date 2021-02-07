package ru.otus.ocajp.webinar22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// Составление простого лямбда-выражения, которое потребляет Predicate
public class Main {
    public static void main(String args[]) {
        System.out.println("Webinar#22.\nJDK: " + System.getProperty("java.version"));

        List al = new ArrayList<>();
        //check(al, al->al.isEmpty()); // compile error. "al" already exist
        Predicate<List> p = alist -> alist.isEmpty();
    }

    private static void check(List list, Predicate<List> predicate) {

    }
}
