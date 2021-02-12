package ru.otus.ocajp.webinar12;

// Конструкции if и if-else, а также тернарный оператор
public class Main {
    public static void main(String... args) {
        System.out.println("Webinar#12!\nJDK: " + System.getProperty("java.version"));
        /*-
        Remember that Java evaluates + from left to right.
        The first two values are both numbers, so the + is evaluated as numeric addition,
        resulting in a reduction to 11 + "7" + 8 + 9.
        The next two terms, 11 + "7", are handled as string concatenation since one of the terms is a String.
        This allows us to reduce the expression to "117" + 8 + 9.
        Likewise, the final two terms are each evaluated one at a time with the String on the left.
        */
        System.out.println(5 + 6 + "7" + 8 + 9); // 11789

        String str = "hello";
        System.out.println(str.equals(null)); // false

    }
}
