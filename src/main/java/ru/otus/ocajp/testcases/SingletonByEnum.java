package ru.otus.ocajp.testcases;

public enum SingletonByEnum {
    INSTANCE;

    public void doWork() {
        System.out.println("SingletonByEnum is working");
    }
}
