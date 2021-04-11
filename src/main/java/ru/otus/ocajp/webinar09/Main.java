package ru.otus.ocajp.webinar09;

/*-
    Арифметические операторы. Операторы присваивания.

    Unary operators have the highest order of precedence.
    Unary operations are always executed before any surrounding binary or ternary operators.
*/
public class Main {

    public static void main(String... args) {
        System.out.println("Webinar#09");

        /*-
             The value 3 is cast to "long".
             The 1 * 2 value is evaluated as "int" but promoted to "long" when added to the 3.
             Trying to store a "long" value in an "int" variable triggers a compiler error.
         */
        // int note = 1 * 2 + (long) 3;// compile error: possible lossy conversion from long to int
        int note = 1 * 2 + 3; // fix error
        System.out.println("note = " + note);

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

        boolean test2 = (boolean) true;

        testIncrement();
    }

    /*-
        First, the expression ++i is evaluated, resulting in the value 2. Now the variable i
        also has the value 2. The target of the assignment is now determined to be the
        element array[2]. Evaluation of the right-hand expression, --i, results in the
        value 1. The variable i now has the value 1. The value of the right-hand
        expression, 1, is then assigned to the array element array[2], causing the array
        contents to become {4, 8, 1}. The program computes and prints the sum of
        these values, 13.
    */
    private static void testIncrement() {
        int[] array = { 4, 8, 6};
        int i = 1;
        array[++i] = --i;
        System.out.println(array[0] + array[1] + array[2]); // [4, 8, 1] -> 13
    }

}