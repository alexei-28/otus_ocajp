package ru.otus.ocajp.webinar14;

// Создание и применение циклов while, do-while, for, for-each
public class Main {
    public static void main(String... args) {
        System.out.println("Webinar#14!\nJDK: " + System.getProperty("java.version"));
        String[] arr = new String[4];
        for (String s : arr) {
            System.out.println("item = " + s); // null (4 times)
        }
        for (int i = 0, j = 1; i < 5; i++, j = j * 2) {
            System.out.println("i = " + i + ", j = " + j);
        }

        /*- Error - нельзя смешивать декларацию
        for (int i = 0, System.out.println("Hello"); i < 3; i++) {
            System.out.println("i = " + i);
        }
        */
        int i; // OK
        for (i = 0, System.out.println("Hello"); i < 3; i++) {
            System.out.println("i = " + i);
        }
        /*-
        Result:
            Hello
            i = 0
            i = 1
            i = 2
        */

        for (int index = 0; index < 5; ) {
            index = ++index; //ok
            //index = index++; // Infinity loop
            System.out.println("Hello, World, index = " + index);
        }
        int j = 3;
        for (; j-- > 0; ) {
            System.out.println("j"); // print "j" 3 times
        }
    }
}
