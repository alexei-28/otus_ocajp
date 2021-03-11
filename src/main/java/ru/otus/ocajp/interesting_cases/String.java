package ru.otus.ocajp.interesting_cases;

// Пространство имен
public class String {
    String() {

    }

    String(String String) {

    }

    String String() {
        return new String();
    }

    // "ru.otus.ocajp.interesting_cases.String" suppress "java.lang.String"
    // Must be:
    // public static void main(java.lang.String[] args) {
    public static void main(String[] args) { // error here
        String String = new String(new String().String());
        System.out.println("String!");
    }
}