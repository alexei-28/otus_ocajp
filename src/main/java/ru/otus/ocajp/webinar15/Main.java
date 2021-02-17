package ru.otus.ocajp.webinar15;

// Вложенные циклы, метки, команды break и continue
public class Main {

    public static void main(String args[]) {
        System.out.println("Webinar#15!\nJDK: " + System.getProperty("java.version"));
        System.out.println("Test1");
        label:
        if (true) {
            label2:
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
                //continue label; // compile error, not a loop label
                continue label2; // OK, but warning: "continue" is unnecessary as the last statement in a loop
                //continue; // OK, but warning: "continue" is unnecessary as the last statement in a loop
            }
        }
        System.out.println("Test2");
        label3:
        for (int i = 0; i < 2; i++) {
            label4:
            for (int j = 0; j < 2; j++) {
                System.out.println("i = " + i + ", j = " + j);
                continue label3;
            }
        }

        System.out.println("Test3");
        BUNNY:
        for (int i = 0; i < 4; i++) {
            RABBIT:
            for (int j = 0; j < 4; j++) { // always true
                System.out.println("i = " + i + ", j = " + j);
                continue BUNNY;
            }
            System.out.println("after RABBIT(inner)"); // never print
        }
        System.out.println("after BUNNY(outer)");

        System.out.println("Test4");
        while (true) {
            System.out.println("while_and_break");
            break;
        }

        System.out.println("Test5");
        int testIn = 5;
        do {
            System.out.println("do_while_break, testIn = " + testIn);
            testIn--;
            if (testIn == 3) {
                break;
            }
            continue; // "continue" is unnecessary as the last statement in a loop
        } while (testIn != 0);
    }
}
