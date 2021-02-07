package ru.otus.ocajp.webinar25;

import java.util.Arrays;

public class Child extends MyParent {

    protected void printName(int input) {
        System.out.println("child_printName = " + input);
    }

    public static void main(String... args) {
        MyParent a = new Child();
        a.printName(5); // call Child.printName(5)

        computer(new int[]{1, 2, 3}); // [1,2,3],[]
        computer(new int[]{1, 2, 3}, new int[]{5, 6, 7}, new int[]{11,12});
    }

    public static void computer(int[] a1, int[]... a2) {
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + a2);
    }

    @Override
    public void printText() {
        System.out.println("Child_printText");
    }
}
