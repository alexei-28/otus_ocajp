package ru.otus.ocajp.webinar25;

import java.util.Arrays;

public class MyChild extends MyParent {

    protected void printName(int input) {
        System.out.println("MyChild.printName, param = " + input);
    }

    public static void main(String... args) {
        MyParent a = new MyChild();
        a.printName(5); // call MyChild.printName(5)

        System.out.println("first");
        computer(new int[]{1, 2, 3}); // [1,2,3] , []
        System.out.println("second");
        computer(new int[]{1, 2, 3}, new int[]{5, 6, 7}, new int[]{11,12});
    }

    public static void computer(int[] a1, int[]... a2) {
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));
    }

    @Override
    public void printText() {
        System.out.println("MyChild_printText");
    }
}
