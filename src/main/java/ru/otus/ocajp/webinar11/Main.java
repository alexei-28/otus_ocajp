package ru.otus.ocajp.webinar11;

import java.math.BigDecimal;

// Логические операторы. Порядок выполнения
public class Main {
    public static void main(String... args) {
        System.out.println("Webinar#11!\nJDK: " + System.getProperty("java.version"));

        // The XOR ^ operator evaluates to "true" if p and q differ and "false" if they are the same.
        boolean p = true;
        boolean q = false;
        boolean first = p ^ q;
        System.out.println("first = " + first); // true

        boolean second = true ^ true;
        System.out.println("second = " + second); // false

        /*-
            The element referenced by a[i] is determined based on the current value of i,
            which is 0—that is, the element a[0]. The expression i = 9 will evaluate to the
            value 9, which will be assigned to the variable i. The value 9 is also assigned to the
            array element a[0]. After the execution of the statement, the variable i will
            contain the value 9, and the array a will contain the values 9 and 6. The program
            will print 9 9 6 at runtime.
        */
        int i = 0;
        int[] a = {3, 6};
        a[i] = i = 9; // a[0] = 9
        System.out.println("i = " + i + ", a[0] = " + a[0] + ", a[1] = " + a[1]); // 9 9 6

        /*-
            Строка с bool1 использует численное продвижение: сначала на double 1.5 делается эксплицитный каст до float 1.5,
            после чего этот float численно продвигается обратно до double,
            чтобы можно было сравнить эти два значения при помощи оператора ‛not equal’, давая в результате false.
            Result = false - потому что сравниваем double и float.
            Но вообще из-за ошибок округления компилятора так лучше вообще не сравнивать вещественные числа.
            Help:
            https://javarush.ru/groups/posts/2136-ustroystvo-vejshestvennihkh-chisel
            https://habr.com/ru/post/219595/
         */
        boolean bool = (1.5 != (float) 1.5);
        System.out.println("bool = " + bool); // false

        boolean bool2 = (1.5 != 1.5);
        System.out.println("bool2 = " + bool2); // false

        // Incorrect example:
        // Прибавляем к нулю 0.1 одиннадцать раз подряд
        double f1 = 0.0;
        for (int j = 1; j <= 11; j++) {
            f1 += 0.1;
        }
        //Умножаем 0.1 на 11
        double f2 = 0.1 * 11;
        //должно получиться одно и то же - 1.1 в обоих случаях
        System.out.println("f1 = " + f1); // 1.0999999999999999
        System.out.println("f2 = " + f2); // 1.1
        // Никогда не используй == при сравнении чисел с плавающей точкой.
        if (f1 == f2)
            System.out.println("f1 и f2 равны!");
        else
            System.out.println("f1 и f2 не равны!"); // result print this

        // Correct example#1:
        // Прибавляем к нулю 0.1 одиннадцать раз подряд.
        // У нас есть специальное «пороговое» число(threshold) — 0.0001, одна десятитысячная. Оно может быть и другим.
        // Это зависит от того, насколько точное сравнение тебе нужно в конкретном случае. Можно сделать его и больше, и меньше.
        final double threshold = 0.0001;
        double f11 = .0;
        for (int i2 = 1; i2 <= 11; i2++) {
            f11 += 0.1;
        }
        //Умножаем 0.1 на 11
        double f22 = 0.1 * 11;
        System.out.println("f11 = " + f11);
        System.out.println("f22 = " + f22);
        /*-
            С помощью метода Math.abs() мы получаем модуль числа. Модуль — это значение числа независимо от знака.
            Мы вычитаем второе число из первого, и если полученный результат, независимо от знака,
            будет меньше того порога, который мы установили, значит наши числа равны.
            Во всяком случае, они равны до той степени точности, которую мы установили с помощью
            нашего «порогового числа», то есть как минимум они равны вплоть до одной десятитысячной.
            Такой способ сравнения избавит тебя от неожиданного поведения, которое мы увидели в случае с ==.
         */
        if (Math.abs(f11 - f22) < threshold)
            System.out.println("f11 и f22 равны"); // result print this
        else
            System.out.println("f11 и f22 не равны");

        // Correct example#2
        /*
           Создаем два объекта BigDecimal - ноль и 0.1.
           Делаем то же самое что и раньше - прибавляем 0.1 к нулю 11 раз подряд
           В классе BigDecimal сложение осуществляется с помощью метода add()
        */
        BigDecimal fbd = new BigDecimal(0.0);
        BigDecimal pointOne = new BigDecimal(0.1);
        for (int i3 = 1; i3 <= 11; i3++) {
            fbd = fbd.add(pointOne);
        }
       /*
           Здесь тоже ничего не изменилось: создаем два объекта BigDecimal
           и умножаем 0.1 на 11
           В классе BigDecimal умножение осуществляется с помощью метода multiply()
       */
        BigDecimal fbd2 = new BigDecimal(0.1);
        BigDecimal eleven = new BigDecimal(11);
        fbd2 = fbd2.multiply(eleven);
        System.out.println("fbd = " + fbd); // 1.1000000000000000610622663543836097232997417449951171875
        System.out.println("fbd2 = " + fbd2);//1.1000000000000000610622663543836097232997417449951171875
       /*
           Еще одна особенность BigDecimal - объекты чисел нужно сравнивать между
           собой с помощью специального метода compareTo()
       */
        if (fbd.compareTo(fbd2) == 0)
            System.out.println("fbd и fbd2 равны"); // print this
        else
            System.out.println("fbd и fbd2 не равны");
    }

}
