package ru.otus.ocajp.webinar08;

// Применение операторов, включая переопределение приоритета. Унарные операторы

// Unary operators have the highest order of precedence.
public class Main {
    // Unary operators have the highest order of precedence.
    public static void main(String... args) {
        System.out.println("Webinar#08.\nJDK: " + System.getProperty("java.version"));

        Integer a = 8;
        a--;
        System.out.println("a = " + a); // 7

        // Перезапись переменной
        double x = 4.5;
        x = x + ++x; // 4.5 + 5.5 (слева направо)
        System.out.println("x = " + x); // 10.0

        // Перезапись переменной
        int i = 0;
        int i2 = i++; // i never used
        System.out.println(i2); // 0

        int i3 = 0;
        i3 = i3 + 1;
        System.out.println(i3); // 1

        int i4 = 0;
        i4++;
        System.out.println(i4); // 1

        /*-
            First, the expression "++item" is evaluated, resulting in the value 2. Now the variable "item"
            also has the value 2. The target of the assignment is now determined to be the
            element array[2]. Evaluation of the right-hand expression, "--item", results in the
            value 1. The variable "item" now has the value 1. The value of the right-hand
            expression, 1, is then assigned to the array element array[2], causing the array
            contents to become {4, 8, 1}. The program computes and prints the sum of
            these values, 13.
         */
        int[] array = {4, 8, 16};
        int item = 1;
        array[++item] = --item;
        System.out.println(array[0] + array[1] + array[2]); // 13

        int assignmentX = 10;
        assignmentX += 5; // 15
        System.out.println("assignmentX = " + assignmentX);
        assignmentX -= 7; // 8
        System.out.println("assignmentX = " + assignmentX);

        // Interesting case:

        // Explanation in "Применение операторов, включая переопределение приоритета. Унарные операторы "
        int w = 0;
        w = w++;
        System.out.println("w = " + w); // 0

        int w2 = 0;
        w2++;
        System.out.println("w2 = " + w2); // 1

        int k = 0;
        k = ++k;
        System.out.println("k = " + k); // 1

    }

}
