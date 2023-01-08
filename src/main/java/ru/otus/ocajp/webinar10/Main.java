package ru.otus.ocajp.webinar10;

// Конкатенация. Операторы (не-)равенства и сравнения
public class Main {

    public static void main(String... args) {
        System.out.println("Webinar#10!\nJDK: " + System.getProperty("java.version"));

        System.out.println("" + 10 + 5 == 4 + 11 + "");// false -> строка "105" слева и строка "15" справа
        System.out.println("" + 10 + 5 == 50 + 55 + "");// true -> строка "105" слева и строка "105" справа

        // Поменять местами 2 числа без использования 3-й переменной
        int a = 2, b = 4;
        System.out.println("before swap: a = " + a + ", b = " + b);
        a = a + b; // a = 2 + 4 = 6
        b = a - b; // b = 6 - 4 = 2
        a = a - b; // a = 6 - 2 = 4
        System.out.println("after swap:  a = " + a + ", b = " + b);

        short h = 40;
        // h = (short) h + (short) 2; // compile error, promotion to int
        h = (short) ((short) h + (short) 2); // ok
        System.out.println("h = " + h); // 42

        short s = 10;
        //Integer i = s; // compile error
        int si = s;
        Integer i = (int) s;
        System.out.println("i = " + i + ", si = " + si);

        int test = 1;
        test += test++ - --test;
        System.out.println("test = " + test);

        String str = "";
        // str = null + 'a'; // compile error. Operator '+' can not be applied to 'null', 'a'
        // str += null + 'a'; // compile error. Operator '+' can not be applied to 'null', 'a'
        str = null + "test";
        System.out.println("str = " + str); // nulltest

        str += (String) null + 'a';
        System.out.println("str = " + str); // nulla

        String str2 = "";
        str2 += 'a';
        str2 = str2 + null + 'a';
        System.out.println("str2 = " + str2); // anulla

        str2 = "hello" + 'a';
        System.out.println("str2_last = " + str2); // helloa

        // auto autoboxing
        double testDouble = new Double(1_000_000.00);
        System.out.println("testDouble = " + testDouble);

        // You can convert a primitive to wrapper class object simply by assigning it (autoboxing)
        Double testDouble2 = new Double(11111);
        double testDouble3 = testDouble2;
        System.out.println("testDouble3 = " + testDouble3); // 11111.0zzz

        bitwise_OR_Operator();
    }

    /*-
        Bitwise OR (|) operator can use with:
        - booleans
        - integers
     */
    private static void bitwise_OR_Operator() {
        // When two booleans are compared the result is true if either of them is true
        boolean boolRes = false | true; // true
        System.out.println("bitwiseLogicalOperators_boolRes = " + boolRes);

        boolean boolRes2 = true | false; // true
        System.out.println("bitwiseLogicalOperators_boolRes2 = " + boolRes2);

        // The OR operator compares each binary digit of two integers
        int value1 = 6;
        int value2 = 5;
        int result = value1 | value2; // 7
        System.out.println("bitwiseLogicalOperators_result = " + result);
    }

}