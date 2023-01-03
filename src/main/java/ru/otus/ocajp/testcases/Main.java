package ru.otus.ocajp.testcases;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static StringBuilder work(StringBuilder a, StringBuilder b) {
        a = new StringBuilder("a");
        b.append("b");
        return a;
    }

    public final static void main(String... args) {
        System.out.println("Hello, Test cases!\nJDK: " + System.getProperty("java.version"));

        // Java 10 (Local-Variable Type Inference)
        /*-
        var myList = new ArrayList<String>();
        myList.add("first");
        myList.add("second");
        System.out.println("myList(var) = " + myList);
        */

        /*-
            If a class doesn't have an equals method, Java determines whether the references point to the
            same object—which is exactly what == does. In case you are wondering, the authors of
            StringBuilder did not implement equals(). If you call equals() on two StringBuilder
            instances, it will check reference equality.
        */
        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = work(s1, s2);
        System.out.println("s1 = " + s1); // s1 = s1
        System.out.println("s2 = " + s2); // s2 = s2b
        System.out.println("s3 = " + s3); // s3 = a

        test();

        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);
        date.plusDays(2);
        date.plusYears(3);
        //Not change because LocalDate is immutable class AND return value is ignored.
        System.out.println(date); // 2018-04-30

        label1:
        if (s1.toString().equals("s1")) {
            System.out.println("label1 in if");
            break label1;
        }

        /*-
        for: if(true) { // incorrect label name
            System.out.println("label_for");
        }
         */

        String race = "";
        loop:
        break loop; // OK
        race += "x";
        System.out.println("race = " + race);
        // While the label is still present, it no longer points to a loop.
        // break loop; // compile error, undefined label: loop

        Singleton singleton = Singleton.getInstance();
        System.out.println("singleton = " + singleton);

        // Понятно, что конструктор надо сделать приватным, иначе можно сделать так:
        //Singleton singleton1 = new Singleton();
        //System.out.println("singleton1 = " + singleton1);

        // Create Singleton by Enum
        System.out.println();
        SingletonByEnum singletonByEnum = SingletonByEnum.INSTANCE;
        System.out.println("singletonByEnum = " + singletonByEnum);
        singletonByEnum.doWork();
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
