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

        test();
        test2();

        if (false);

        label_1: if (true) break label_1; // can use break with label
        System.out.println("After label");

        label_2: if (true) {
            System.out.println("inside if");
            break label_2;
        }
        System.out.println("After label 2");
    }

    // Success compile because all(2) "else" statements, has(2) preceding "if" statements.
    private static void test() {
        int temp = 4;
        long humidity = -temp + temp * 3;
        System.out.println("temp = " + temp + ", humidity = " + humidity); // temp = 4, humidity = 8
        if (temp >= 4)
            if (humidity < 6)
                System.out.println("too low");
            else
                System.out.println("just right"); // print this
        else System.out.println("Too high");
    }

    private static void test2() {
        String[] numbers = {"1", "2", "1", "1"};
        int counter = 0;
        if ("1".equals(numbers[0])) {
            counter++;
        } else if ("1".equals(numbers[1])) { // вообще не исполняются, так как вычисление if-выражения дает true
            counter++;
        } else if ("1".equals(numbers[2])) {// вообще не исполняются, так как вычисление if-выражения дает true
            counter++;
        } else if ("1".equals(numbers[3])) {// вообще не исполняются, так как вычисление if-выражения дает true
            counter++;
        }
        System.out.println("counter = " + counter); // 1
    }
}
