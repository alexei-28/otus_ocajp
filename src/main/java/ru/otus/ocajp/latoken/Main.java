package ru.otus.ocajp.latoken;

public class Main {

    public static final void main(String args[]) {
        System.out.println("Latoken!\nJDK: " + System.getProperty("java.version"));

        new Child();

        test();
    }

    private static void test() {
        System.out.println("test");
    }
}
