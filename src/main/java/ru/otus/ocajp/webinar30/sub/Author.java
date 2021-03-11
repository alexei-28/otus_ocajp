package ru.otus.ocajp.webinar30.sub;

import java.io.FileNotFoundException;

public class Author extends Programmer {
    /*-
        The process() method is declared final in the Programmer class.
        The Author class then attempts to override this method, resulting in a compilation error.
    */
    // compile error
    /*-
    protected final void process() {

    }

     */

    /*-
        В классе наследнике(Author) метод, который был переопределен (testMethod)
        в сигнатуре(throws) метода может:
        - указывать такой же, как и в родительском методе, checked исключение
        - указывать более узкий checked исключений
        - не указывать checked исключение
    */
    @Override
    public void testMethod() {
        System.out.println("Author testMethod");
    }
}
