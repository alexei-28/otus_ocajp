package ru.otus.ocajp.webinar27;

// Создание и перегрузка конструкторов, включая влияние на дефолтный конструктор

/*-
    Класс нельзя расширить если:
    - класс final
    - у класса есть private конструктор(user defined) БЕЗ аргументов (e.g. private MyParent(){})

    Важно!
    Компилятор всегда пытается вставить безаргументный вызов super() в любой пригодный для этого конструктор.
    А «пригодным» является только тот конструктор, где нет своего собственного вызова super() или this()
    с любым количеством аргументов.

    Конструктор без аргументов, который создается по умолчанию компилятором называется
    "default constructor" или "compiler default constructor".
    Конструктор без аргументов, который создается программистом называется "user defined constructor".

    A default constructor can't coexist with other constructors.
    A default constructor is automatically created by the Java compiler if the user doesn't
    define any constructor in a class.
    If the user reopens the source code file and adds a constructor to the class,
    upon recompilation no default constructor will be created for the class.
 */
public class Main {

    public static void main(String args[]) {
        System.out.println("Webinar#27.\nJDK: " + System.getProperty("java.version"));

        new MyChild2();
        // Very important test:
        /*-
            Example: ClassC.name
            Reference к статическому полю запускает инициализацию только в том классе(ClassA) или интерфейсе
            в котором декларируется это поле ("name"). И не важно через что мы стучимся до этого поля:
            - через subclass
            - через subinterface
            - через класс, который имплементирует интерфейс

            Т.е:
            Мы пытаемся достучаться до статического поля "name", через класс "ClassC".
            "ClassC" - это "внук" класса "ClassA".
            Это поле "name" проинициализированно в классе "ClassA".
            Т.е "name" инициализируется ТОЛЬКО в классе "ClassA" и больше НЕ меняется.

        */
        System.out.println("first case");
        // In webinar#27 (01:42:00)
        // Другой случай: new ClassC().name
        // 1. Нам нужен объект класса ClassC
        // 2. Чтобы был объект класса ClassC нужно, чтобы был класс ClassC
        // 3. Чтобы был класс ClassC нужно, чтобы был класс ClassB
        // 4. Чтобы был класс ClassB нужно, чтобы был класс ClassA
        //System.out.println(new ClassC().name); // Hello from B C A
        // Execute ONLY "new ClassC().name" OR only "ClassC.name". Not both  (comment one or another method)

        System.out.println("second case");
        System.out.println(ClassC.name); // Hello from A

        System.out.println("third case");
        new Child(10);

        System.out.println("fourth case");
        new MyChild3();

        System.out.println("five case");
        new B("Test");
    }
}
