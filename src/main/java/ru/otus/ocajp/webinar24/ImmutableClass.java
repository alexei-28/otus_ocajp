package ru.otus.ocajp.webinar24;

// Немутируемость через возврат защищенной копии
public class ImmutableClass {
    private StringBuilder sb = new StringBuilder("Hello");

    public StringBuilder getIt() {
        return sb;
    }

    // Возвращаем защищенную копию.
    public StringBuilder getDefended() {
        return new StringBuilder(sb.toString());
    }
}
