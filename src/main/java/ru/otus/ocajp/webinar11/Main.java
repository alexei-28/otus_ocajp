package ru.otus.ocajp.webinar11;

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
         */
        boolean bool1 = (1.5 != (float) 1.5);
        System.out.println("bool1 = " + bool1); // false
    }

}
