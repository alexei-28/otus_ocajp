package ru.otus.ocajp.webinar04;

public class Test {

    public interface MyInterface {
        public void someMethod();
    }

    public Test() {

    }

    public void testMethod() {
        char c; // local variable has not been initialize by default
        //System.out.println("c = " + c); // compile error, variable "c" might not have been initialized
    }
}
