package ru.otus.ocajp.homework08;

public class Main {

    public static void main(String... args) {
        System.out.println("Homework#08");
        int i = 0;
        int i2 = i++; // i never used
        System.out.println(i2); // 0

        int i3 = 0;
        i3 = i3 + 1;
        System.out.println(i3); // 1

        int i4 = 0;
        i4++;
        System.out.println(i4); // 1
    }

}
