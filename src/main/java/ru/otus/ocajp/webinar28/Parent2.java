package ru.otus.ocajp.webinar28;

public class Parent2 {

    Parent2() {
        // Вызов переопределенного(override) метода "greet()" из конструктора - это ПЛОХАЯ практика.
        // Так как ведет к исполнению метода на еще неполностью сформированном объекте.
        greet();
        // Печатает null, т.к "greet()" привязан к классу Child2,
        // а "str" в этой точке еще сохраняет default значение = null
    }

    void greet() {
        System.out.print("Hello!");
    }
}
