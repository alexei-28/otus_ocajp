package ru.otus.ocajp.interesting_cases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    // Enum-ы - это статическая конструкция.
    enum Values {
        A(1), B(2), C(3);

        // Constructor
        Values(int i) {
            System.out.print(i);
        }

         /*-
            У Enum-ов static инитеры выполняются после конструкторов.
            У классов static инитеры выполняются до конструкторов.
        */
        static {
            System.out.print("static");
        }
    }

    public static void main(String arg[]) {
        System.out.println("Interesting cases.\nJDK: " + System.getProperty("java.version"));

        System.out.println(Values.A); // print "123staticA"

        int j = 0;
        // Перезапись переменной j (j = 0)
        j = j++; // warning: The value changed at "j++" and never used
        System.out.println("j = " + j); // 0

        int j2 = 0;
        // Перезапись переменной j не происходит
        j2++;
        System.out.println("j2 = " + j2); // 1

        int j3 = 0;
        int k = j3++;
        System.out.println("k = " + k + ", j3 = " + j3); // 0 1

        int pig = 4;
        // Increments pig by 1, but it returns the original value of 4 since it is using the post-increment operator.
        // The pig variable is then assigned this value, and the increment operation is discarded.
        pig = pig++;
        System.out.println("pig = " + pig); // 4
    }

    // Result -> execute infinity.
    // Throw every time StackOverflowError but not stop and crash, because execute finally block.
    private static void work() {
        try {
            System.out.println("work");
            work();
        } finally {
            work();
        }
    }

    private static void test() {
        int[] arr = new int[1];
        int index = 2;
        // сначала запоминается index (1)
        arr[--index] = index / --index; // java.lang.ArithmeticException: / by zero
    }

    // TreeSet when use method "add()" call "compareTo" that work only with Integer.
    private static void test2() {
        Set<Number> set = new TreeSet<Number>();
        set.add(1);
        set.add(1L); // java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.Long
        set.add(1.0);
        System.out.println(set.size());
    }

    // Generic существует только на уровне компиляции.
    // Т.е в runtime нет возможности проверить, что запихнули в list.
    private static  void test3() {
        List list = new ArrayList<Long>();
        // Компилятор смотрит то что слева(List list = ...).
        // Так как мы работаем с НЕ типизированным list-ом, то мы можем запихнуть туда что угодно.
        list.add(1L);
        list.add(1.0);
        list.add(new Object());
        list.add("I am Long");
        System.out.println("list_size = " + list.size()); // OK, list_size = 4
    }
}
