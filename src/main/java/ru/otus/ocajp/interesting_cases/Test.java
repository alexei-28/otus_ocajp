package ru.otus.ocajp.interesting_cases;

public class Test {
    static {
        if (true) {
            throw  new NullPointerException(); // error : java.lang.ExceptionInInitializerError
        }
    }

    private static  void run() {
        System.out.println("run");
    }
    public static void main(String[] args) {
        try {
            System.out.println("main");
            Test.run();
        } catch (Throwable ex) { // here ExceptionInInitializerError witn cause = NullPointerException
            /*-
                Если в static initializer происходит исключение, то JVM не грузит дааный класс
                и при любом НОВОМ обращении к данному классу JVM весгда будет бросать NoClassDefFoundError.
             */
            Test.run();
        }
    }
}
