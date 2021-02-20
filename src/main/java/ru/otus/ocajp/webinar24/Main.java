package ru.otus.ocajp.webinar24;

// Применение ключевого слова static к методам и полям.
// Реализация принципов инкапсуляции в классе. Поведение объектных ссылок и примитивных переменных,
// передаваемых в методы

/*-
Attention!
    Java использует передачу по значению для копирования примитивов и ссылок на объекты в метод.
    Это означает, что изменения примитивного значения или ссылки в методе не влияют на вызывающий метод.
    Тем не менее, данные внутри объекта могут изменяться, но не сама исходная ссылка.
*/

public class Main {
    public double a;
    private int total = 10;
    private static int count = 2;

    // Любые финальный переменные нужно инициализировать сразу или в инитерах (static блоки)
    //private static final int one; // compile error. Variable one not initialized in the default constructor
    private static final int two = 2;

    // compile error. Non-static variable "total" cannot be referenced from a static context
    // private static double average = total / count;

    public String someNonStaticMethod() {
        return "someNonStaticMethod";
    }

    public static void main(String args[]) {
        System.out.println("Webinar#24.\nJDK: " + System.getProperty("java.version"));

        new Main().a = 10;// OK
        Main mainClass = new Main();
        mainClass.a = 20; // OK
        // Из static метода нельзя вызвать НЕ static метод.
        // НО...из static метода можно создать объект И вызвать НЕ static метод этого объекта.
        String result = mainClass.someNonStaticMethod();
        System.out.println("call_someNonStaticMethod_result = " + result);

        // Also can use null ref to call static method
        mainClass = null;
        // Java replace mainClass.doIt() by Main.doIt()
        mainClass.doIt(100);
        System.out.println("Success call static method from by null ref");

        doIt(34); // 34
        Integer intRef = 34;
        doIt(intRef); // 34
        Long longRef = 34l;
        doIt(longRef); // 34

        // С переменными работает
        short shortValue = 32;
        System.out.println("shortValue = " + shortValue);

        // С параметрами метода не работает
        //doItWithShort(34); // compile error. Incompatible types: possible lossy conversion from int to short

        // Need explicit cast to short
        doItWithShort((short) 32); // ok

        // Копия данных
        int num = 4;
        newNumber(num);
        System.out.println("num = " + num); // 4

        // Значение переменной "name" не меняется потому что класс String - это immutable кдасс
        String name = "Webby";
        // Передается копия ссылки (адрес в памяти).
        // Итого 2 ссылки будут ссылаться на одит и тот же объект.
        speak(name);
        System.out.println("name = " + name); // Webby

        // Значение переменной "name" не меняется потому что класс String - это immutable кдасс.
        // Передается копия ссылки (адрес в памяти).
        // Итого 2 ссылки будут ссылаться на один и тот же объект.
        speak2(name);
        System.out.println("name two = " + name); // Webby

        // Значение переменной "name" изменилось, потому что мы сделали присвоение "name" на новый объект.
        // Передается копия ссылки (адрес в памяти).
        // Итого 2 ссылки будут ссылаться на одит и тот же объект.
        name = speak2(name);
        System.out.println("name three = " + name); // Sparky

        // Побочный эффект
        // Переменные "nameSb" и "sbInMethod" указывают на ОДИН и тот же объект.
        // Так как класс StringBuilder - это mutable класс, то меняется значение переменной "nameSb".
        StringBuilder nameSb = new StringBuilder();
        // Передается копия ссылки (адрес в памяти).
        // Итого 2 ссылки будут ссылаться на одит и тот же объект.
        speak(nameSb); // sbInMethod.append("Hello");
        System.out.println("nameSb = " + nameSb); // Hello

        // Немутируемость через возврат защищенной копии
        ImmutableClass immutableClass = new ImmutableClass();
        // Возвращаем наш объект в нетронутом состоянии
        System.out.println("immutableClass.getIt() = " + immutableClass.getIt()); // Hello

        // Попытка перевернуть через защищенную копию потерпит неудачу
        // Т.е мы НЕ мзменили ВНУТРЕНЕЕ состояние объекта благодаря защищенной копии - это хорошо.
        // Таким образом объект становится НЕ мутируемым.
        immutableClass.getDefended().reverse();
        System.out.println("immutableClass.getDefended().reverse() = " + immutableClass.getIt()); // Hello

        // Попытка перевернуть без защищенной копии будет успешной
        // Т.е мы мзменили ВНУТРЕНЕЕ состояние объекта через getXXX метод - это плохо.
        // Таким образом объект становится мутируемым.
        immutableClass.getIt().reverse();
        System.out.println("immutableClass.getIt().reverse() = " + immutableClass.getIt()); // olleH
    }

    private static void doIt(long longParam) {
        System.out.println("doIt: longParam = " + longParam);
    }

    private static void doItWithShort(short shortParam) {
        System.out.println("shortParam = " + shortParam);
    }

    // Копия данных. Передаем копию переменной "num".
    // Объявляем НОВУЮ переменную "num" и с ней уже работаем внутри метода.
    private static void newNumber(int num) {
        num = 8;
        //System.out.println("num in method = " + num); // 8
    }

    // Копия данных. Передаем копию переменной "name".
    // Объявляем НОВУЮ переменную "name" и с ней уже работаем внутри метода.
    private static void speak(String name) {
        name = "Sparky";
        //System.out.println("name in method = " + name); // Sparky
    }

    // Копия данных. Передаем копию переменной "name".
    // Объявляем НОВУЮ переменную "name" и с ней уже работаем внутри метода.
    private static String speak2(String name) {
        name = "Sparky";
        return name;
    }

    private static void speak(StringBuilder sbInMethod) {
        sbInMethod.append("Hello");
    }
}