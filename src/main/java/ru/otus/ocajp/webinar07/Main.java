package ru.otus.ocajp.webinar07;

// Чтение и запись объектных полей. Классы-оболочки
public class Main {

    public static void main(String... args) {
        System.out.println("Webinar#07.\nJDK: " + System.getProperty("java.version"));

        boolean test = true;
        // FALSE не является валидным ключевым словом для boolean-литерала
        //boolean test2 = FALSE; // compile error


        /*-
            Pool of numbers is a range -128...127. Pool work for the next wrapper objects:
             - Byte
             - Short
             - Integer
             - Long
        */
        Long var1 = Long.valueOf(123);
        Long var2 = Long.valueOf("123");
        System.out.println(var1 == var2); // true, because var1 and var2 refer to the same cache object (pool of numbers).

        Long var3 = Long.valueOf(223);
        Long var4 = Long.valueOf("223");
        System.out.println(var3 == var4); // false, because var3 and var4 refer to the different objects (out of range of pool of numbers).

    }

}
