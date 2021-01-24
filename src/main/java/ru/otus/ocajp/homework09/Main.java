package ru.otus.ocajp.homework09;

public class Main {

    public static void main(String... args) {
        System.out.println("Homework#09");
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
    }

}