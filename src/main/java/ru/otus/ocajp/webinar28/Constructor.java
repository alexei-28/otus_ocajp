package ru.otus.ocajp.webinar28;

public class Constructor {

    public static void main(String... args) {
        bogo(new Extension());
    }

    private static void bogo(Base  b) {
        b.add(8);
        b.print(); // print "22" because method "Base.add()" NEVER call.
    }
}
