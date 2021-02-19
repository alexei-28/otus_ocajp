package ru.otus.ocajp.webinar28;

/*-
    Разработка кода, демонстрирующего полиморфизм;
    включая переопределение и противопоставление объектного типа ссылочному.

     - Переменные НЕ переопределяются (overriding).
     - Методы не final, не static и не private могут переопределяться (overriding).
       Такие методы называются виртуальными.
 */
public class Main {
    public static final void main(String args[]) {
        System.out.println("Webinar#28.\nJDK: " + System.getProperty("java.version"));

        // Полиморфизм:
        C o1 = new C();
        B o2 = o1; // Reftype (слева),  Actype (справа)

        // Методы ВСЕГДА берутся из reftype.
        // Потом они подменяются на actype если методы переопределены.
        // На этапе компиляции смотрим на reftype (то что слева).

        // Какой метод будет использоваться зависит от actype(C)
        System.out.println("o1.someMethod (depend on actype) = " + o1.someMethod()); // 30

        System.out.println("o2.someMethod (depend on actype) = " + o2.someMethod()); // 30

        // Какая именно переменная будет использоваться зависит от reftype(B)
        System.out.println("o2.someVariable (depend on reftype) = " + o2.someVariable); // 20
    }
}
