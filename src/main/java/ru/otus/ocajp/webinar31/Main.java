package ru.otus.ocajp.webinar31;


/*-
    Противопоставление контролируемых исключений неконтролируемым, в т.ч. ошибкам.
    Работа с типичными классами исключений. Преимущества обработки исключений.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Webinar#31.\nJDK: " + System.getProperty("java.version"));
    }

    /*-
        Any class that extends RuntimeException or Error,
        including the classes themselves, is an unchecked exception.
     */
    private static void myMethod() throws RuntimeException {

    }
}
