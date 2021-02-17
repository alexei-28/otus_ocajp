package ru.otus.ocajp.testcases;

/*-
    The explanation of why static initializers work is actually pretty complicated, but the Java
    Language Specification guarantees that a class will not be initialized twice, so the JVM is
    required to guarantee that the initializer is run in a thread-safe fashion.
    The only time the static-initializer approach isn't workable is when initialization
    information must be passed into the constructor at runtime.
 */
class Singleton {
    // неленивый синглтон
    private static final Singleton instance = new Singleton();

    // Понятно, что конструктор надо сделать приватным, иначе можно сделать так в клиентском коде:
    // Singleton singleton1 = new Singleton();
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}