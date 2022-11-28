package ru.otus.ocajp.webinar06;

// Жизненный цикл объекта (создание, переприсваивание ссылки и сборка мусора)
public class Main {
    public static void main(String args[]) {
        System.out.println("Webinar#06.\nJDK: " + System.getProperty("java.version"));

        /*-
        The empty String on line 10 is instantiated, and then line 12 appends an "a".
        However, because the String object is immutable, a new String object is assigned to alpha and the "" object
        becomes eligible for garbage collection. The next time through the loop, alpha is
        assigned a new String object, "ab", and the "a" object becomes eligible for garbage
        collection. The next iteration assigns alpha to "abc" and the "ab" object becomes eligible
        for garbage collection, and so on.
        */
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha);
    }
}
