package ru.otus.ocajp.homework04;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Solution {


    public Solution() {
        Date date;
        date = new Date();
        System.out.println(date);

        // Инициализацию в фигурных скобках можно делать только в строке объявления переменной.
        String[] arrayString = {"one", "two"}; // OK
        String[] arrayString2 = new String[]{"one", "two"}; // OK
        //String[] arrayString = {"one", "two"}; // compile error: Array initializer is not allowed here
        System.out.println("arrayString2 = " + arrayString2);

        List<Person> listPersons = Arrays.asList(new Person("Alex", 20), new Person("John", 34));
        // Print addresses in memory: [ru.otus.ocajp.homework04.Person@70dea4e, ru.otus.ocajp.homework04.Person@5c647e05]
        // To print human readable you must override toString()
        System.out.println("listPersons = " + listPersons);

        // The range of the char data type is 0 to 65535.
        char c1 = 98; // return value from ASCII table
        char c2 = (char) 70000; // belka v kolese
        char c3 = (char) -98; // belka v kolese
        //System.out.println("c1 = " + c1 + ", c2 = " + c2 + ", c3 = " + c3); //c1 = b, c2 = ᅰ, c3 = ﾞ

        String[][] astr = new String[2][];
        //astr[0] = new String[2];
        //astr[1] = new String[3];
        System.out.println("astr = " + Arrays.toString(astr));
        for (int index = 0; index < astr.length; index++) {
            System.out.println("i = " + index);
            for (int j = 0; j < astr.length; j++) {
                System.out.println("j = " + j);
                System.out.println("astr[" + index + "," + j + "] = " + astr[index][j]);
            }
        }
    }

}
