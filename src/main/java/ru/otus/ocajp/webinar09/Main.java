package ru.otus.ocajp.webinar09;

import static java.lang.Float.NaN;

// Арифметические операторы. Операторы присваивания
public class Main {

    public static void main(String... args) {
        System.out.println("Webinar#09");
        float test = 1_000f;
        System.out.println("test = " + test);

        // Cast - это унарная операция

        int y = - -10; // унарная опнрация (знак минус)
        System.out.println("y = " + y); // positive 10
        // --10; //compile error. Decrement valid only for variable
        int i = 10;
        //(++(++i)); // compile error

        // Остаток получается, когда ОБА операнда имеют одинаковый знак
        int r = 7 % 7; // 0
        int r2 = -7 % 5; // -2
        float f = -7.0f % 5.0f;// -2.0f
        System.out.println("r = " + r + ", r2 = " + r2 + ", f = " + f);

        // С сhar работает любая арифметика
        char char1 = 'a';
        System.out.println(char1 - char1); // 0

        // "+=" -> сначала сложи, затем присвой и в конце CAST.
        // "a+= smt" не то же самое, что "a = a + smt", так как "a+=smt" делает еще и CAST.
        int a = 2;
        a*= a + 4; // a = (int) (a * (a + 4)) 
        System.out.println("a = " + a); // 12

        // Returns true if the specified number is a Not-a-Number (NaN) value, false otherwise.
        boolean isNotANumber = Float.isNaN(10.0f);
        System.out.println("isNotANumber(10.0f) = " + isNotANumber); // false

        short height = 4, weight = 1;
        /*-
            Even though both height and weight are cast to byte,
            the multiplication operator automatically promotes them to "int",
            resulting in an attempt to store an int in a short variable
        */
        //short zebra = (byte) height * (byte) weight; // compile error. Promotion to "int"
        //short zebra = (short) ((short) height * (short) weight); // ok

        byte apples = 5;
        short oranges = 10;
        // propagation to int
        // short bananas = oranges - apples; // compile error: possible lossy conversion from int to short

        long goat = 1;
        // goat = 1.0; // compile error
        goat += 1.0; // increment AND do implicit cast (compound operator applies casting automatically)
        System.out.println("goat = " + goat); // 2
    }

}